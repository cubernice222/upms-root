package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.BaseResp;
import org.cuber.bo.PageResult;

import java.util.List;


@DataObject(generateConverter = true)
public class PagingUserResp extends BaseResp {

    private List<UserBo> records;

    private PageResult pageResult;


    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }

    public List<UserBo> getRecords() {
        return records;
    }

    public void setRecords(List<UserBo> records) {
        this.records = records;
    }

    public PagingUserResp() {

    }

    public PagingUserResp(JsonObject jsonObject) {
        PagingUserRespConverter.fromJson(jsonObject,this);
    }

    @Override
    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        PagingUserRespConverter.toJson(this,jsonObject);
        return jsonObject;
    }
}
