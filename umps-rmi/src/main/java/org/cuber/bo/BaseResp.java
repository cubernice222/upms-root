package org.cuber.bo;

public abstract class BaseResp extends VertxBO{

    protected String resultDesc;

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }
}
