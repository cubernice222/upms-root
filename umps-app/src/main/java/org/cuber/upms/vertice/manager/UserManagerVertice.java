package org.cuber.upms.vertice.manager;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.reactivex.core.AbstractVerticle;
import io.vertx.reactivex.core.eventbus.EventBus;
import io.vertx.reactivex.core.eventbus.MessageConsumer;
import io.vertx.reactivex.ext.jdbc.JDBCClient;
import org.cuber.upms.vertice.MessageAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerVertice extends AbstractVerticle {

    @Autowired
    private JDBCClient jdbcClient;

    private MessageConsumer<JsonObject> userMessageConsumer;

    private static Logger logger = LoggerFactory.getLogger(UserManagerVertice.class);

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        EventBus eb = vertx.eventBus();
        userMessageConsumer = eb.consumer(MessageAddress.USER_MANAGER_ADDRESS);
    }

    @Override
    public void stop(Future<Void> stopFuture) throws Exception {
        userMessageConsumer.unregister(asyncResult->{
            if(asyncResult.succeeded()){
                logger.info("退出消费userManager consumer 完成");
            }else{
                logger.error("退出消费userManager consumer 异常",asyncResult.failed());
            }
        });
    }
}