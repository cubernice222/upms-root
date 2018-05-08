package org.cuber.upms.conf;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.NamingConvention;
import io.ebean.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;

@Configuration
public class EbeanConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public ServerConfig initConfig(){
        ServerConfig serverConfig = new ServerConfig();
        serverConfig.loadFromProperties();
        serverConfig.setDataSource(dataSource);
        List<String>  packages = Arrays.asList("org.cuber.umps.facade.model");
        serverConfig.setPackages(packages);
        return serverConfig;
    }

    @Bean
    public EbeanServer initServer(){
        EbeanServer ebeanServer = EbeanServerFactory.create(initConfig());
        return ebeanServer;
    }
}
