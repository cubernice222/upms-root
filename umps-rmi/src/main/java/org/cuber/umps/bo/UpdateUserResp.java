package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.BaseResp;

@DataObject(generateConverter = true)
public class UpdateUserResp extends BaseResp {

    private boolean update;

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public UpdateUserResp() {
    }

    public UpdateUserResp(JsonObject jsonObject) {
        UpdateUserRespConverter.fromJson(jsonObject, this);
    }

    @Override
    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        UpdateUserRespConverter.toJson(this, json);
        return json;
    }
}
