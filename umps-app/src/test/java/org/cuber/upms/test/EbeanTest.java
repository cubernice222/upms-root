package org.cuber.upms.test;

import io.ebean.EbeanServer;
import org.cuber.upms.repo.domain.User;
import org.cuber.upms.UpmsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UpmsApplication.class)
public class EbeanTest {
    @Autowired
    private EbeanServer ebeanServer;

    private static Logger logger = LoggerFactory.getLogger(EbeanTest.class);

    @Test
    public void testInsert(){

        User user = ebeanServer.createEntityBean(User.class);
        user.setAvatar("https://about.cuber.org/me/avatar.png");
        user.setBirthday(LocalDateTime.of(1988,2,22,21,30));
        user.setCorpNumber("0222");
        user.setDingUserId("empty4now");
        user.setEmail("190231170@qq.com");
        user.setFullName("cuber.huang");
        user.setOperator("test");
        user.setPhone("08613248199190");
        user.setSex("male");
        user.setStatus("0");
        user.setWechatUserId("empty4now");
        ebeanServer.save(user);
        logger.info("I like to see");

    }
}
