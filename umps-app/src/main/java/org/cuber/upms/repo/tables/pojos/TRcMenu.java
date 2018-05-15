/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.cuber.upms.repo.tables.interfaces.ITRcMenu;


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
public class TRcMenu implements VertxPojo, ITRcMenu {

    private static final long serialVersionUID = -1281363148;

    private Integer       menuId;
    private String        code;
    private String        pCode;
    private String        name;
    private String        url;
    private String        menuType;
    private String        menuScope;
    private Integer       level;
    private Integer       sort;
    private String        status;
    private String        operator;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;

    public TRcMenu() {}

    public TRcMenu(TRcMenu value) {
        this.menuId = value.menuId;
        this.code = value.code;
        this.pCode = value.pCode;
        this.name = value.name;
        this.url = value.url;
        this.menuType = value.menuType;
        this.menuScope = value.menuScope;
        this.level = value.level;
        this.sort = value.sort;
        this.status = value.status;
        this.operator = value.operator;
        this.updateTime = value.updateTime;
        this.createTime = value.createTime;
    }

    public TRcMenu(
        Integer       menuId,
        String        code,
        String        pCode,
        String        name,
        String        url,
        String        menuType,
        String        menuScope,
        Integer       level,
        Integer       sort,
        String        status,
        String        operator,
        LocalDateTime updateTime,
        LocalDateTime createTime
    ) {
        this.menuId = menuId;
        this.code = code;
        this.pCode = pCode;
        this.name = name;
        this.url = url;
        this.menuType = menuType;
        this.menuScope = menuScope;
        this.level = level;
        this.sort = sort;
        this.status = status;
        this.operator = operator;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }

    @Override
    public Integer getMenuId() {
        return this.menuId;
    }

    @Override
    public TRcMenu setMenuId(Integer menuId) {
        this.menuId = menuId;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public TRcMenu setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getPCode() {
        return this.pCode;
    }

    @Override
    public TRcMenu setPCode(String pCode) {
        this.pCode = pCode;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public TRcMenu setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getUrl() {
        return this.url;
    }

    @Override
    public TRcMenu setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String getMenuType() {
        return this.menuType;
    }

    @Override
    public TRcMenu setMenuType(String menuType) {
        this.menuType = menuType;
        return this;
    }

    @Override
    public String getMenuScope() {
        return this.menuScope;
    }

    @Override
    public TRcMenu setMenuScope(String menuScope) {
        this.menuScope = menuScope;
        return this;
    }

    @Override
    public Integer getLevel() {
        return this.level;
    }

    @Override
    public TRcMenu setLevel(Integer level) {
        this.level = level;
        return this;
    }

    @Override
    public Integer getSort() {
        return this.sort;
    }

    @Override
    public TRcMenu setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public TRcMenu setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String getOperator() {
        return this.operator;
    }

    @Override
    public TRcMenu setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    @Override
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public TRcMenu setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    @Override
    public TRcMenu setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TRcMenu (");

        sb.append(menuId);
        sb.append(", ").append(code);
        sb.append(", ").append(pCode);
        sb.append(", ").append(name);
        sb.append(", ").append(url);
        sb.append(", ").append(menuType);
        sb.append(", ").append(menuScope);
        sb.append(", ").append(level);
        sb.append(", ").append(sort);
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
    public void from(ITRcMenu from) {
        setMenuId(from.getMenuId());
        setCode(from.getCode());
        setPCode(from.getPCode());
        setName(from.getName());
        setUrl(from.getUrl());
        setMenuType(from.getMenuType());
        setMenuScope(from.getMenuScope());
        setLevel(from.getLevel());
        setSort(from.getSort());
        setStatus(from.getStatus());
        setOperator(from.getOperator());
        setUpdateTime(from.getUpdateTime());
        setCreateTime(from.getCreateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITRcMenu> E into(E into) {
        into.from(this);
        return into;
    }

    public TRcMenu(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
