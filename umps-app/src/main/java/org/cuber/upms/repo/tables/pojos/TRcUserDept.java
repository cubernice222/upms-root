/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.cuber.upms.repo.tables.interfaces.ITRcUserDept;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRcUserDept implements VertxPojo, ITRcUserDept {

    private static final long serialVersionUID = -1891350863;

    private Integer       userDeptId;
    private Integer       userId;
    private Integer       deptId;
    private String        status;
    private String        operator;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;

    public TRcUserDept() {}

    public TRcUserDept(TRcUserDept value) {
        this.userDeptId = value.userDeptId;
        this.userId = value.userId;
        this.deptId = value.deptId;
        this.status = value.status;
        this.operator = value.operator;
        this.updateTime = value.updateTime;
        this.createTime = value.createTime;
    }

    public TRcUserDept(
        Integer       userDeptId,
        Integer       userId,
        Integer       deptId,
        String        status,
        String        operator,
        LocalDateTime updateTime,
        LocalDateTime createTime
    ) {
        this.userDeptId = userDeptId;
        this.userId = userId;
        this.deptId = deptId;
        this.status = status;
        this.operator = operator;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }

    @Override
    public Integer getUserDeptId() {
        return this.userDeptId;
    }

    @Override
    public TRcUserDept setUserDeptId(Integer userDeptId) {
        this.userDeptId = userDeptId;
        return this;
    }

    @Override
    public Integer getUserId() {
        return this.userId;
    }

    @Override
    public TRcUserDept setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public Integer getDeptId() {
        return this.deptId;
    }

    @Override
    public TRcUserDept setDeptId(Integer deptId) {
        this.deptId = deptId;
        return this;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public TRcUserDept setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String getOperator() {
        return this.operator;
    }

    @Override
    public TRcUserDept setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    @Override
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public TRcUserDept setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    @Override
    public TRcUserDept setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TRcUserDept (");

        sb.append(userDeptId);
        sb.append(", ").append(userId);
        sb.append(", ").append(deptId);
        sb.append(", ").append(status);
        sb.append(", ").append(operator);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ITRcUserDept from) {
        setUserDeptId(from.getUserDeptId());
        setUserId(from.getUserId());
        setDeptId(from.getDeptId());
        setStatus(from.getStatus());
        setOperator(from.getOperator());
        setUpdateTime(from.getUpdateTime());
        setCreateTime(from.getCreateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITRcUserDept> E into(E into) {
        into.from(this);
        return into;
    }

    public TRcUserDept(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
