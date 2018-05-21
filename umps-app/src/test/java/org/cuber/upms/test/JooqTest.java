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

import java.time.LocalDateTime;
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
        CompletableFuture<TRcUser> userFuture = new CompletableFuture<>();
        TRcUser tRcUser = new TRcUser();
        tRcUser.setAvatar("http://org.cuber.com/aboutme/icon");
        LocalDateTime birthDay = LocalDateTime.of(2018,2,22,21,30);
        tRcUser.setBirthday(birthDay);
        tRcUser.setCorpNumber("123456");
        tRcUser.setEmail("cuber.carrots@gmail.com");
        tRcUser.setDingUserId("ding1234567");
        tRcUser.setFullName("cuber carrots");
        tRcUser.setOperator("system");
        tRcUser.setPhone("08613248199190");
        tRcUser.setSex("m");
        tRcUser.setUserName("cuber");
        tRcUser.setWechatUserId("wechat1234567");
        tRcUserDao.insert(tRcUser).doOnSuccess(integer -> {
            logger.info("这个是:{}",integer);
        }).subscribe();
//        tRcUserDao.findOneById(1).doOnEvent((tRcUser1, throwable) -> {
//            if(Objects.isNull(throwable)){
//                logger.info("查询到的数据为:{}",tRcUser1.get());
//                userFuture.complete(tRcUser1.get());
//            }else{
//                logger.error("查询发生错误",throwable);
//                userFuture.completeExceptionally(throwable);
//            }
//        });
//        userFuture.get(60, TimeUnit.SECONDS);
    }
}
