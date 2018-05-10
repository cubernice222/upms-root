package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.PagingResp;

import java.util.List;


@DataObject(generateConverter = true)
public class UserPagingResp extends PagingResp {

    private List<UserBo> records;


    public List<UserBo> getRecords() {
        return records;
    }

    public void setRecords(List<UserBo> records) {
        this.records = records;
    }

    public UserPagingResp() {

    }

    public UserPagingResp(JsonObject jsonObject) {
        UserPagingRespConverter.fromJson(jsonObject,this);
    }

    @Override
    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        UserPagingRespConverter.toJson(this,jsonObject);
        return jsonObject;
    }
}
