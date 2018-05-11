package org.cuber.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public class PageReq {

    public PageReq() {
    }

    public PageReq(JsonObject jsonObject) {
        PageReqConverter.fromJson(jsonObject,this);
    }

    protected int pageSize;

    protected int pageNumber;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public JsonObject toJson(){
        JsonObject jsonObject = new JsonObject();
        PageReqConverter.toJson(this,jsonObject);
        return jsonObject;
    }
}
