package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.BaseReq;

@DataObject(generateConverter = true)
public class SeekUserReq extends BaseReq{


    public SeekUserReq() {
    }

    public SeekUserReq(JsonObject jsonObject){
        SeekUserReqConverter.fromJson(jsonObject,this);
    }

    private String userName;

    private String wechatUserId;

    private String dingUserId;

    private String email;

    private String phone;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWechatUserId() {
        return wechatUserId;
    }

    public void setWechatUserId(String wechatUserId) {
        this.wechatUserId = wechatUserId;
    }

    public String getDingUserId() {
        return dingUserId;
    }

    public void setDingUserId(String dingUserId) {
        this.dingUserId = dingUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public JsonObject toJson(){
        JsonObject json = new JsonObject();
        SeekUserReqConverter.toJson(this, json);
        return json;
    }
}
