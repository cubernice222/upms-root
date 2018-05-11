package org.cuber.upms.repo.mapper;

import io.ebean.EbeanServer;
import io.ebean.ExpressionList;
import org.apache.commons.lang3.StringUtils;
import org.cuber.bo.PageReq;
import org.cuber.upms.repo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class UserMapper {

    @Autowired
    private EbeanServer ebeanServer;

    public User findOne(User queryUser){
        User user = null;
        ExpressionList<User> expressionList = ebeanServer.find(User.class).where();
        if(Objects.nonNull(queryUser.getUserId())){
            expressionList.idEq(queryUser.getUserId());
        }else if(StringUtils.isNoneEmpty(queryUser.getEmail())){
            expressionList.eq("email",queryUser.getEmail());
        }else if(StringUtils.isNoneEmpty(queryUser.getPhone())){
            expressionList.eq("phone",queryUser.getPhone());
        }else if(StringUtils.isNoneEmpty(queryUser.getUserName())){
            expressionList.eq("userName",queryUser.getUserName());
        }else if(StringUtils.isNoneEmpty(queryUser.getDingUserId())){
            expressionList.eq("dingUserId",queryUser.getDingUserId());
        }else if(StringUtils.isNoneEmpty(queryUser.getWechatUserId())){
            expressionList.eq("wechatUserId",queryUser.getWechatUserId());
        }else{
            return null;
        }
        user = expressionList.findOne();
        return user;
    }

    public void update(User user)throws Exception{
        ebeanServer.update(user);
    }

    public void save(User user){
        ebeanServer.save(user);
    }

    public void queryList(User user, PageReq pageReq){

    }

}
