package org.cuber.bo;

public abstract class BaseReq extends VertxBO{

    protected String traceId;

    protected String bizDesc;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getBizDesc() {
        return bizDesc;
    }

    public void setBizDesc(String bizDesc) {
        this.bizDesc = bizDesc;
    }
}

