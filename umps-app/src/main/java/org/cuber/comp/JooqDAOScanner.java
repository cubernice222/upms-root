package org.cuber.comp;

import io.vertx.reactivex.ext.asyncsql.AsyncSQLClient;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.classreading.MetadataReader;

import java.io.IOException;
import java.util.Set;


public class JooqDAOScanner extends ClassPathBeanDefinitionScanner {

    BeanDefinitionRegistry registry;
    private AsyncSQLClient asyncSQLClient;
    private Configuration configuration;

    public JooqDAOScanner(BeanDefinitionRegistry registry, AsyncSQLClient asyncSQLClient, Configuration configuration ) {
        super(registry);
        this.registry = registry;
        this.asyncSQLClient = asyncSQLClient;
        this.configuration = configuration;
    }

    @Override
    public int scan(String... basePackages) {
        int beanCountAtScanStart = this.registry.getBeanDefinitionCount();

        Set<BeanDefinitionHolder> holders =  doScan(basePackages);

        holders.stream().forEach(beanDefinitionHolder -> {
            GenericBeanDefinition definition = (GenericBeanDefinition)beanDefinitionHolder.getBeanDefinition();
            try{
                Class originalBeanClass = definition.resolveBeanClass(this.getResourceLoader().getClassLoader());
                definition.getConstructorArgumentValues().addIndexedArgumentValue(0,originalBeanClass);
                definition.getConstructorArgumentValues().addIndexedArgumentValue(1,asyncSQLClient);
                definition.getConstructorArgumentValues().addIndexedArgumentValue(2,configuration);
                definition.setBeanClass(JooqDAOFatoryBean.class);
            }catch (Exception e){

            }
        });


        return (this.registry.getBeanDefinitionCount() - beanCountAtScanStart);
    }

    @Override
    protected boolean isCandidateComponent(MetadataReader metadataReader) throws IOException {
        return true;
    }

    @Override
    protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
        return true;
    }
}
