/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.cuber.upms.repo.tables.TRcRole;
import org.cuber.upms.repo.tables.interfaces.ITRcRole;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TRcRoleRecord extends UpdatableRecordImpl<TRcRoleRecord> implements VertxPojo, Record9<Integer, String, String, String, String, String, String, LocalDateTime, LocalDateTime>, ITRcRole {

    private static final long serialVersionUID = 1866248535;

    /**
     * Setter for <code>upms.t_rc_role.role_id</code>. 主键
     */
    @Override
    public TRcRoleRecord setRoleId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>upms.t_rc_role.role_id</code>. 主键
     */
    @Override
    public Integer getRoleId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>upms.t_rc_role.name</code>. 角色中文
     */
    @Override
    public TRcRoleRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>upms.t_rc_role.name</code>. 角色中文
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>upms.t_rc_role.role_scope</code>. 角色系统
     */
    @Override
    public TRcRoleRecord setRoleScope(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>upms.t_rc_role.role_scope</code>. 角色系统
     */
    @Override
    public String getRoleScope() {
        return (String) get(2);
    }

    /**
     * Setter for <code>upms.t_rc_role.role</code>. 角色实际CODE
     */
    @Override
    public TRcRoleRecord setRole(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>upms.t_rc_role.role</code>. 角色实际CODE
     */
    @Override
    public String getRole() {
        return (String) get(3);
    }

    /**
     * Setter for <code>upms.t_rc_role.tips</code>. 角色描述
     */
    @Override
    public TRcRoleRecord setTips(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>upms.t_rc_role.tips</code>. 角色描述
     */
    @Override
    public String getTips() {
        return (String) get(4);
    }

    /**
     * Setter for <code>upms.t_rc_role.status</code>. 是否有效,0/1 无效/有效
     */
    @Override
    public TRcRoleRecord setStatus(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>upms.t_rc_role.status</code>. 是否有效,0/1 无效/有效
     */
    @Override
    public String getStatus() {
        return (String) get(5);
    }

    /**
     * Setter for <code>upms.t_rc_role.operator</code>.
     */
    @Override
    public TRcRoleRecord setOperator(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>upms.t_rc_role.operator</code>.
     */
    @Override
    public String getOperator() {
        return (String) get(6);
    }

    /**
     * Setter for <code>upms.t_rc_role.update_time</code>.
     */
    @Override
    public TRcRoleRecord setUpdateTime(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>upms.t_rc_role.update_time</code>.
     */
    @Override
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>upms.t_rc_role.create_time</code>.
     */
    @Override
    public TRcRoleRecord setCreateTime(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>upms.t_rc_role.create_time</code>.
     */
    @Override
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TRcRole.T_RC_ROLE.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TRcRole.T_RC_ROLE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TRcRole.T_RC_ROLE.ROLE_SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TRcRole.T_RC_ROLE.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TRcRole.T_RC_ROLE.TIPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TRcRole.T_RC_ROLE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TRcRole.T_RC_ROLE.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return TRcRole.T_RC_ROLE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field9() {
        return TRcRole.T_RC_ROLE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRoleScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTips();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRoleScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTips();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord value1(Integer value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord value3(String value) {
        setRoleScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord value4(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord value5(String value) {
        setTips(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord value6(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord value7(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord value8(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord value9(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcRoleRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRcRoleRecord
     */
    public TRcRoleRecord() {
        super(TRcRole.T_RC_ROLE);
    }

    /**
     * Create a detached, initialised TRcRoleRecord
     */
    public TRcRoleRecord(Integer roleId, String name, String roleScope, String role, String tips, String status, String operator, LocalDateTime updateTime, LocalDateTime createTime) {
        super(TRcRole.T_RC_ROLE);

        set(0, roleId);
        set(1, name);
        set(2, roleScope);
        set(3, role);
        set(4, tips);
        set(5, status);
        set(6, operator);
        set(7, updateTime);
        set(8, createTime);
    }

    public TRcRoleRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}