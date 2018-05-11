package org.cuber.repo;


import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class OperateDataModel extends BaseModel{

    protected String status;

    protected String operator;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
