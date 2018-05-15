package org.cuber.upms.test;

import org.cuber.upms.UpmsApplication;
import org.cuber.upms.repo.tables.daos.TRcUserDao;
import org.cuber.upms.repo.tables.pojos.TRcUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UpmsApplication.class)
public class JooqTest {

    @Autowired(required = false)
    private TRcUserDao tRcUserDao;
    private static Logger logger = LoggerFactory.getLogger(JooqTest.class);
    @Test
    public void test() throws Exception{
        CompletableFuture<TRcUser> userFature = new CompletableFuture<>();
        tRcUserDao.findOneById(1).doOnEvent((tRcUser, throwable) -> {
            if(Objects.isNull(throwable)){
                logger.info("查询到的数据为:{}",tRcUser.get());
                userFature.complete(tRcUser.get());
            }else{
                logger.error("查询发生错误",throwable);
                userFature.completeExceptionally(throwable);
            }
        });
        userFature.get(2, TimeUnit.SECONDS);
    }
}
