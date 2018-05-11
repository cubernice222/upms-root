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
        }else if(StringUtils.isNotEmpty(queryUser.getEmail())){
            expressionList.eq("email",queryUser.getEmail());
        }else if(StringUtils.isNotEmpty(queryUser.getPhone())){
            expressionList.eq("phone",queryUser.getPhone());
        }else if(StringUtils.isNotEmpty(queryUser.getUserName())){
            expressionList.eq("userName",queryUser.getUserName());
        }else if(StringUtils.isNotEmpty(queryUser.getDingUserId())){
            expressionList.eq("dingUserId",queryUser.getDingUserId());
        }else if(StringUtils.isNotEmpty(queryUser.getWechatUserId())){
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
        ExpressionList<User> expressionList = ebeanServer.find(User.class).where();

        if(StringUtils.isNotEmpty(user.getUserName())){
            expressionList.like("userName", "%" + user.getUserName()+ "%");
        }

        if(StringUtils.isNotEmpty(user.getFullName())){
            expressionList.like("fullName", "%" + user.getFullName()+ "%");
        }



    }

}
