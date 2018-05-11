package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.BaseReq;
import org.cuber.bo.PageReq;

@DataObject(generateConverter = true)
public class PagingUserReq extends BaseReq{

    private String fullName;
    private String userName;

    private PageReq pageReq;

    public PageReq getPageReq() {
        return pageReq;
    }

    public void setPageReq(PageReq pageReq) {
        this.pageReq = pageReq;
    }

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

    public PagingUserReq() {
        super();
    }

    public PagingUserReq(JsonObject jsonObject) {
        PagingUserReqConverter.fromJson(jsonObject,this);

    }

    @Override
    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        PagingUserReqConverter.fromJson(jsonObject,this);
        return jsonObject;
    }
}
