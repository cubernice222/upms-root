package org.cuber.upms.conf;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.reactivex.ext.asyncsql.AsyncSQLClient;
import io.vertx.reactivex.ext.asyncsql.PostgreSQLClient;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Properties;

@Configuration
@ConfigurationProperties("vertx.postgresql")
public class JooqConfig extends Properties{

    @Autowired
    private Vertx vertx;

    @Bean("defaultJooqConfiguration")
    public org.jooq.Configuration jooqConfig(){
        org.jooq.Configuration configuration = new DefaultConfiguration();
        configuration.set(SQLDialect.POSTGRES);
        return configuration;
    }

    @Bean
    public AsyncSQLClient asyncSQLClient(){
        JsonObject clientConfig = new JsonObject((Map)this);
        io.vertx.reactivex.core.Vertx vertxReactive = io.vertx.reactivex.core.Vertx.newInstance(vertx);
        AsyncSQLClient asyncSQLClient = PostgreSQLClient.createShared(vertxReactive,clientConfig);
        return asyncSQLClient;
    }

}
