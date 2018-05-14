package org.cuber.upms.comp;

import io.vertx.reactivex.ext.asyncsql.AsyncSQLClient;
import org.cuber.comp.JooqDAOScanner;
import org.jooq.Configuration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class JooqDAORegistry implements BeanDefinitionRegistryPostProcessor {
    @Resource(name = "defaultJooqConfiguration")
    private Configuration configuration;

    @Autowired
    private AsyncSQLClient asyncSQLClient;
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        JooqDAOScanner scanner = new JooqDAOScanner(registry,asyncSQLClient,configuration);
        scanner.scan()

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // do nothing
    }
}
