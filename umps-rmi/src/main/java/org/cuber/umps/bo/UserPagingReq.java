package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.PagingReq;

@DataObject(generateConverter = true)
public class UserPagingReq extends PagingReq{

    private String fullName;
    private String userName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserPagingReq() {
        super();
    }

    public UserPagingReq(JsonObject jsonObject) {
        UserPagingReqConverter.fromJson(jsonObject,this);
    }

    @Override
    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        UserPagingReqConverter.toJson(this,jsonObject);
        return jsonObject;
    }
}
