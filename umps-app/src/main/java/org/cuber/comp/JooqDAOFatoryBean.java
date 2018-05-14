package org.cuber.comp;

import io.vertx.reactivex.ext.asyncsql.AsyncSQLClient;
import org.jooq.Configuration;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Constructor;

public class JooqDAOFatoryBean<T> implements FactoryBean<T> {

    private Class<T> daoClass;
    private AsyncSQLClient asyncSQLClient;
    private Configuration configuration;

    public JooqDAOFatoryBean(Class<T> daoClass, AsyncSQLClient asyncSQLClient, Configuration configuration) {
        this.daoClass = daoClass;
        this.asyncSQLClient = asyncSQLClient;
        this.configuration = configuration;
    }

    @Override
    public T getObject() throws Exception {
        Constructor c1 = daoClass.getDeclaredConstructor(Configuration.class, AsyncSQLClient.class);
        return (T) c1.newInstance(configuration,asyncSQLClient);
    }

    @Override
    public Class<?> getObjectType() {
        return daoClass;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
