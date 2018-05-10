package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.BaseResp;

@DataObject(generateConverter = true)
public class SeekUserResp extends BaseResp{


    public SeekUserResp() {
    }

    public SeekUserResp(JsonObject jsonObject){
        SeekUserRespConverter.fromJson(jsonObject,this);
    }

    private UserBo userBo;

    public UserBo getUserBo() {
        return userBo;
    }

    public void setUserBo(UserBo userBo) {
        this.userBo = userBo;
    }

    public JsonObject toJson(){
        JsonObject json = new JsonObject();
        SeekUserRespConverter.toJson(this, json);
        return json;
    }
}
