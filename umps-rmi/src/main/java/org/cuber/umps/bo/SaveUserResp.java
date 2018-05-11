package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.BaseResp;

@DataObject(generateConverter = true)

public class SaveUserResp extends BaseResp {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SaveUserResp() {
    }

    public SaveUserResp(JsonObject jsonObject) {
        SaveUserRespConverter.fromJson(jsonObject,this);
    }

    @Override
    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        SaveUserRespConverter.fromJson(jsonObject,this);
        return jsonObject;
    }
}
