/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.cuber.upms.repo.tables.interfaces.ITRcRoleMenu;


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
public class TRcRoleMenu implements VertxPojo, ITRcRoleMenu {

    private static final long serialVersionUID = 1164986055;

    private Integer       roleMenuId;
    private Integer       roleId;
    private Integer       menuId;
    private String        status;
    private String        operator;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;

    public TRcRoleMenu() {}

    public TRcRoleMenu(TRcRoleMenu value) {
        this.roleMenuId = value.roleMenuId;
        this.roleId = value.roleId;
        this.menuId = value.menuId;
        this.status = value.status;
        this.operator = value.operator;
        this.updateTime = value.updateTime;
        this.createTime = value.createTime;
    }

    public TRcRoleMenu(
        Integer       roleMenuId,
        Integer       roleId,
        Integer       menuId,
        String        status,
        String        operator,
        LocalDateTime updateTime,
        LocalDateTime createTime
    ) {
        this.roleMenuId = roleMenuId;
        this.roleId = roleId;
        this.menuId = menuId;
        this.status = status;
        this.operator = operator;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }

    @Override
    public Integer getRoleMenuId() {
        return this.roleMenuId;
    }

    @Override
    public TRcRoleMenu setRoleMenuId(Integer roleMenuId) {
        this.roleMenuId = roleMenuId;
        return this;
    }

    @Override
    public Integer getRoleId() {
        return this.roleId;
    }

    @Override
    public TRcRoleMenu setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    @Override
    public Integer getMenuId() {
        return this.menuId;
    }

    @Override
    public TRcRoleMenu setMenuId(Integer menuId) {
        this.menuId = menuId;
        return this;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public TRcRoleMenu setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String getOperator() {
        return this.operator;
    }

    @Override
    public TRcRoleMenu setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    @Override
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public TRcRoleMenu setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    @Override
    public TRcRoleMenu setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TRcRoleMenu (");

        sb.append(roleMenuId);
        sb.append(", ").append(roleId);
        sb.append(", ").append(menuId);
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
    public void from(ITRcRoleMenu from) {
        setRoleMenuId(from.getRoleMenuId());
        setRoleId(from.getRoleId());
        setMenuId(from.getMenuId());
        setStatus(from.getStatus());
        setOperator(from.getOperator());
        setUpdateTime(from.getUpdateTime());
        setCreateTime(from.getCreateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITRcRoleMenu> E into(E into) {
        into.from(this);
        return into;
    }

    public TRcRoleMenu(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
