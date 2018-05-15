/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.cuber.upms.repo.tables.interfaces.ITRcRole;


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
public class TRcRole implements VertxPojo, ITRcRole {

    private static final long serialVersionUID = 536697566;

    private Integer       roleId;
    private String        name;
    private String        roleScope;
    private String        role;
    private String        tips;
    private String        status;
    private String        operator;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;

    public TRcRole() {}

    public TRcRole(TRcRole value) {
        this.roleId = value.roleId;
        this.name = value.name;
        this.roleScope = value.roleScope;
        this.role = value.role;
        this.tips = value.tips;
        this.status = value.status;
        this.operator = value.operator;
        this.updateTime = value.updateTime;
        this.createTime = value.createTime;
    }

    public TRcRole(
        Integer       roleId,
        String        name,
        String        roleScope,
        String        role,
        String        tips,
        String        status,
        String        operator,
        LocalDateTime updateTime,
        LocalDateTime createTime
    ) {
        this.roleId = roleId;
        this.name = name;
        this.roleScope = roleScope;
        this.role = role;
        this.tips = tips;
        this.status = status;
        this.operator = operator;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }

    @Override
    public Integer getRoleId() {
        return this.roleId;
    }

    @Override
    public TRcRole setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public TRcRole setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getRoleScope() {
        return this.roleScope;
    }

    @Override
    public TRcRole setRoleScope(String roleScope) {
        this.roleScope = roleScope;
        return this;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public TRcRole setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public String getTips() {
        return this.tips;
    }

    @Override
    public TRcRole setTips(String tips) {
        this.tips = tips;
        return this;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public TRcRole setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String getOperator() {
        return this.operator;
    }

    @Override
    public TRcRole setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    @Override
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public TRcRole setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    @Override
    public TRcRole setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TRcRole (");

        sb.append(roleId);
        sb.append(", ").append(name);
        sb.append(", ").append(roleScope);
        sb.append(", ").append(role);
        sb.append(", ").append(tips);
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
    public void from(ITRcRole from) {
        setRoleId(from.getRoleId());
        setName(from.getName());
        setRoleScope(from.getRoleScope());
        setRole(from.getRole());
        setTips(from.getTips());
        setStatus(from.getStatus());
        setOperator(from.getOperator());
        setUpdateTime(from.getUpdateTime());
        setCreateTime(from.getCreateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITRcRole> E into(E into) {
        into.from(this);
        return into;
    }

    public TRcRole(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}