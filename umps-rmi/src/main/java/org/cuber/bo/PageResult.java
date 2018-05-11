package org.cuber.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.umps.bo.PagingUserRespConverter;

@DataObject(generateConverter = true)
public class PageResult {

    protected int pageNumber;

    protected int total;

    protected int pageSize;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public PageResult() {
    }

    public PageResult(JsonObject jsonObject) {
        PageResultConverter.fromJson(jsonObject,this);
    }

    public JsonObject toJson(){
        JsonObject jsonObject = new JsonObject();
        PageResultConverter.toJson(this,jsonObject);
        return jsonObject;
    }
}
