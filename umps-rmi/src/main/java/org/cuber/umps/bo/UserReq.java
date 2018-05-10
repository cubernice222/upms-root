package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.BaseReq;

@DataObject(generateConverter = true)
public class UserReq extends BaseReq {

    private UserBo userBo;

    public UserBo getUserBo() {
        return userBo;
    }

    public void setUserBo(UserBo userBo) {
        this.userBo = userBo;
    }

    public UserReq() {
    }

    public UserReq(JsonObject jsonObject) {
        UserReqConverter.fromJson(jsonObject,this);
    }

    @Override
    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        UserReqConverter.toJson(this,json);
        return json;
    }
}
