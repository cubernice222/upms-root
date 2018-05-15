package org.cuber.upms.comp;

import io.vertx.reactivex.ext.asyncsql.AsyncSQLClient;
import org.cuber.comp.JooqDAOScanner;
import org.jooq.Configuration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"asyncSQLClient","defaultJooqConfiguration"})
public class JooqDAORegistry implements BeanDefinitionRegistryPostProcessor,EnvironmentAware,ApplicationContextAware {

    private Environment environment;
    private ApplicationContext applicationContext;

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        AsyncSQLClient asyncSQLClient = applicationContext.getBean(AsyncSQLClient.class);
        Configuration configuration = applicationContext.getBean(Configuration.class);
        JooqDAOScanner scanner = new JooqDAOScanner(registry,asyncSQLClient,configuration);
        String jooqBasePackage = environment.getProperty("jooq.dao.package");
        scanner.scan(jooqBasePackage);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //do nothing
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
