/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


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
public interface ITRcDept extends VertxPojo, Serializable {

    /**
     * Setter for <code>upms.t_rc_dept.dept_id</code>.
     */
    public ITRcDept setDeptId(Integer value);

    /**
     * Getter for <code>upms.t_rc_dept.dept_id</code>.
     */
    public Integer getDeptId();

    /**
     * Setter for <code>upms.t_rc_dept.simple_name</code>. 部门简称
     */
    public ITRcDept setSimpleName(String value);

    /**
     * Getter for <code>upms.t_rc_dept.simple_name</code>. 部门简称
     */
    public String getSimpleName();

    /**
     * Setter for <code>upms.t_rc_dept.full_name</code>. 部门全称
     */
    public ITRcDept setFullName(String value);

    /**
     * Getter for <code>upms.t_rc_dept.full_name</code>. 部门全称
     */
    public String getFullName();

    /**
     * Setter for <code>upms.t_rc_dept.tips</code>.
     */
    public ITRcDept setTips(String value);

    /**
     * Getter for <code>upms.t_rc_dept.tips</code>.
     */
    public String getTips();

    /**
     * Setter for <code>upms.t_rc_dept.p_dept_id</code>. 父部门ID
     */
    public ITRcDept setPDeptId(Integer value);

    /**
     * Getter for <code>upms.t_rc_dept.p_dept_id</code>. 父部门ID
     */
    public Integer getPDeptId();

    /**
     * Setter for <code>upms.t_rc_dept.status</code>.
     */
    public ITRcDept setStatus(String value);

    /**
     * Getter for <code>upms.t_rc_dept.status</code>.
     */
    public String getStatus();

    /**
     * Setter for <code>upms.t_rc_dept.operator</code>.
     */
    public ITRcDept setOperator(String value);

    /**
     * Getter for <code>upms.t_rc_dept.operator</code>.
     */
    public String getOperator();

    /**
     * Setter for <code>upms.t_rc_dept.update_time</code>.
     */
    public ITRcDept setUpdateTime(LocalDateTime value);

    /**
     * Getter for <code>upms.t_rc_dept.update_time</code>.
     */
    public LocalDateTime getUpdateTime();

    /**
     * Setter for <code>upms.t_rc_dept.create_time</code>.
     */
    public ITRcDept setCreateTime(LocalDateTime value);

    /**
     * Getter for <code>upms.t_rc_dept.create_time</code>.
     */
    public LocalDateTime getCreateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITRcDept
     */
    public void from(org.cuber.upms.repo.tables.interfaces.ITRcDept from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITRcDept
     */
    public <E extends org.cuber.upms.repo.tables.interfaces.ITRcDept> E into(E into);

    @Override
    public default ITRcDept fromJson(io.vertx.core.json.JsonObject json) {
        setDeptId(json.getInteger("dept_id"));
        setSimpleName(json.getString("simple_name"));
        setFullName(json.getString("full_name"));
        setTips(json.getString("tips"));
        setPDeptId(json.getInteger("p_dept_id"));
        setStatus(json.getString("status"));
        setOperator(json.getString("operator"));
        // Omitting unrecognized type java.time.LocalDateTime for column update_time!
        // Omitting unrecognized type java.time.LocalDateTime for column create_time!
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("dept_id",getDeptId());
        json.put("simple_name",getSimpleName());
        json.put("full_name",getFullName());
        json.put("tips",getTips());
        json.put("p_dept_id",getPDeptId());
        json.put("status",getStatus());
        json.put("operator",getOperator());
        // Omitting unrecognized type java.time.LocalDateTime for column update_time!
        // Omitting unrecognized type java.time.LocalDateTime for column create_time!
        return json;
    }

}
