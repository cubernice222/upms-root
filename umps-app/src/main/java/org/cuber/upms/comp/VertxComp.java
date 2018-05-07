package org.cuber.upms.comp;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.spi.cluster.zookeeper.ZookeeperClusterManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
public class VertxComp {

    @Autowired
    private Environment environment;

    private static Logger logger = LoggerFactory.getLogger(VertxComp.class);

    private Vertx vertx;

    private JsonObject clusterConfig(){
        JsonObject zkConfig = new JsonObject();
        String zkHosts = environment.getProperty("zookeeper.hosts");
        zkConfig.put("zookeeperHosts", zkHosts);
        zkConfig.put("rootPath", "io.vertx");
        zkConfig.put("retry", new JsonObject()
                .put("initialSleepTime", 3000)
                .put("maxTimes", 3));
        return zkConfig;
    }

    private ClusterManager createZkClusterManager(){
        return new ZookeeperClusterManager(clusterConfig());
    }

    @PostConstruct
    public void configVertx() throws Exception{
        VertxOptions options = new VertxOptions()
                .setClustered(true)
                .setClusterManager(createZkClusterManager());
        CompletableFuture<Vertx> vertxFuture = new CompletableFuture<>();
        Vertx.clusteredVertx(options, res -> {
            if (res.succeeded()) {
                logger.info("初始化vert.x组件完毕");
                vertxFuture.complete(res.result());
            }else{
                logger.error("初始化vert.x组件错误",res.cause());
                vertxFuture.completeExceptionally(res.cause());
            }
        });
        vertx = vertxFuture.get();
    }

    @Bean(destroyMethod = "")
    Vertx vertx() {
        return vertx;
    }

    @PreDestroy
    void close() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = new CompletableFuture<>();
        vertx.close(ar -> {
            logger.info("关闭vert.x组件完毕");
            future.complete(null);
        });
        future.get();
    }

}