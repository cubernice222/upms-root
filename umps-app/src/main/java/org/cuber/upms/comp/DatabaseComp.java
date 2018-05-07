package org.cuber.upms.comp;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.reactivex.ext.jdbc.JDBCClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Properties;

@Component
@ConfigurationProperties("datasource.conf")
public class DatabaseComp extends Properties {

    @Autowired
    private Vertx vertx;

    private static Logger logger = LoggerFactory.getLogger(DatabaseComp.class);

    @Bean
    public JDBCClient init(){
        JsonObject config = new JsonObject((Map)this);
        config.put("connectionTimeout",Long.parseLong(this.getProperty("connectionTimeout")));
        config.put("idleTimeout",Long.parseLong(this.getProperty("idleTimeout")));
        io.vertx.reactivex.core.Vertx rxVertx = new io.vertx.reactivex.core.Vertx(vertx);
        JDBCClient jdbcClient = JDBCClient.createShared(rxVertx, config);
        logger.info("数据库jdbcClient组件初始化完毕");
        return jdbcClient;
    }
}
