package org.cuber.umps.bo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.cuber.bo.PagingReq;

@DataObject(generateConverter = true)
public class UserPagingReq extends PagingReq{

    private String fullName;

    public UserPagingReq() {
        super();
    }

    public UserPagingReq(JsonObject jsonObject) {

    }

    @Override
    public JsonObject toJson() {
        return null;
    }
}
