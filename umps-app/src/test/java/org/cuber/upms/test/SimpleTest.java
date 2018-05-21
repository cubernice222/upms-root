package org.cuber.upms.test;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.reactivex.ext.asyncsql.AsyncSQLClient;
import io.vertx.reactivex.ext.asyncsql.PostgreSQLClient;
import io.vertx.spi.cluster.zookeeper.ZookeeperClusterManager;
import org.cuber.upms.repo.tables.daos.TRcUserDao;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

public class SimpleTest {
    private static Logger logger = LoggerFactory.getLogger(JooqTest.class);

    @Test
    public void test() throws Exception{
        JsonObject zkConfig = new JsonObject();
        String zkHosts = "101.132.113.199:2181,101.132.113.199:2182,101.132.113.199:2183";
        zkConfig.put("zookeeperHosts", zkHosts);
        zkConfig.put("rootPath", "io.vertx");
        zkConfig.put("retry", new JsonObject()
                .put("initialSleepTime", 3000)
                .put("maxTimes", 3));
        ClusterManager clusterManager = new ZookeeperClusterManager(zkConfig);
        VertxOptions options = new VertxOptions()
                .setClustered(true)
                .setClusterManager(clusterManager);
        CompletableFuture<Vertx> vertxFuture = new CompletableFuture<>();
        Vertx.clusteredVertx(options, res -> {
            if (res.succeeded()) {
                vertxFuture.complete(res.result());
            }else{
                vertxFuture.completeExceptionally(res.cause());
            }
        });
        Vertx vertx = vertxFuture.get();
        org.jooq.Configuration configuration = new DefaultConfiguration();
        configuration.set(SQLDialect.POSTGRES);
        JsonObject clientConfig = new JsonObject();
        clientConfig.put("host","127.0.0.1");
        clientConfig.put("port",5432);
        clientConfig.put("maxPoolSize",20);
        clientConfig.put("username","upms");
        clientConfig.put("password","upms");
        io.vertx.reactivex.core.Vertx vertxReactive = io.vertx.reactivex.core.Vertx.newInstance(vertx);
        AsyncSQLClient asyncSQLClient = PostgreSQLClient.createShared(vertxReactive,clientConfig);
        TRcUserDao dao = new TRcUserDao(configuration, asyncSQLClient);

        CountDownLatch countDownLatch = new CountDownLatch(1);
        dao.findOneById(1).doOnEvent((tRcUser, throwable) -> {
            if(Objects.isNull(throwable)){
                logger.info("查询到的数据为1:{}",tRcUser.get());

            }else{
                logger.error("查询发生错误",throwable);
            }
            countDownLatch.countDown();
        }).doOnError(throwable->{
            logger.error("查询发生错误",throwable);
            countDownLatch.countDown();
        });
        countDownLatch.await();
    }


}
