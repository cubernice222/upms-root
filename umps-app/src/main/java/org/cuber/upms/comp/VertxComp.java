package org.cuber.upms.comp;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.reactivex.ext.asyncsql.AsyncSQLClient;
import io.vertx.reactivex.ext.asyncsql.PostgreSQLClient;
import io.vertx.spi.cluster.zookeeper.ZookeeperClusterManager;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
public class VertxComp implements EnvironmentAware{

    private Environment environment;

    private Vertx vertx;

    private static Logger logger = LoggerFactory.getLogger(VertxComp.class);


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

    @Bean(destroyMethod = "")
    public Vertx init() throws Exception{
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
        return vertx = vertxFuture.get();
    }

    @Bean("defaultJooqConfiguration")
    public org.jooq.Configuration jooqConfig(){
        org.jooq.Configuration configuration = new DefaultConfiguration();
        configuration.set(SQLDialect.POSTGRES);
        return configuration;
    }

    @Bean
    public AsyncSQLClient asyncSQLClient(Vertx vertx){
        JsonObject clientConfig = new JsonObject();
        clientConfig.put("host",environment.getProperty("vertx.postgresql.host"));
        clientConfig.put("port",environment.getProperty("vertx.postgresql.port",Integer.class));
        clientConfig.put("maxPoolSize",environment.getProperty("vertx.postgresql.maxPoolSize",Integer.class));
        clientConfig.put("username",environment.getProperty("vertx.postgresql.username"));
        clientConfig.put("password",environment.getProperty("vertx.postgresql.password"));
        io.vertx.reactivex.core.Vertx vertxReactive = io.vertx.reactivex.core.Vertx.newInstance(vertx);
        AsyncSQLClient asyncSQLClient = PostgreSQLClient.createShared(vertxReactive,clientConfig);
        return asyncSQLClient;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}