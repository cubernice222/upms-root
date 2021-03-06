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
public interface ITRcUserRole extends VertxPojo, Serializable {

    /**
     * Setter for <code>upms.t_rc_user_role.user_role_id</code>.
     */
    public ITRcUserRole setUserRoleId(Integer value);

    /**
     * Getter for <code>upms.t_rc_user_role.user_role_id</code>.
     */
    public Integer getUserRoleId();

    /**
     * Setter for <code>upms.t_rc_user_role.user_id</code>.
     */
    public ITRcUserRole setUserId(Integer value);

    /**
     * Getter for <code>upms.t_rc_user_role.user_id</code>.
     */
    public Integer getUserId();

    /**
     * Setter for <code>upms.t_rc_user_role.role_id</code>.
     */
    public ITRcUserRole setRoleId(Integer value);

    /**
     * Getter for <code>upms.t_rc_user_role.role_id</code>.
     */
    public Integer getRoleId();

    /**
     * Setter for <code>upms.t_rc_user_role.status</code>.
     */
    public ITRcUserRole setStatus(String value);

    /**
     * Getter for <code>upms.t_rc_user_role.status</code>.
     */
    public String getStatus();

    /**
     * Setter for <code>upms.t_rc_user_role.operator</code>.
     */
    public ITRcUserRole setOperator(String value);

    /**
     * Getter for <code>upms.t_rc_user_role.operator</code>.
     */
    public String getOperator();

    /**
     * Setter for <code>upms.t_rc_user_role.update_time</code>.
     */
    public ITRcUserRole setUpdateTime(LocalDateTime value);

    /**
     * Getter for <code>upms.t_rc_user_role.update_time</code>.
     */
    public LocalDateTime getUpdateTime();

    /**
     * Setter for <code>upms.t_rc_user_role.create_time</code>.
     */
    public ITRcUserRole setCreateTime(LocalDateTime value);

    /**
     * Getter for <code>upms.t_rc_user_role.create_time</code>.
     */
    public LocalDateTime getCreateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITRcUserRole
     */
    public void from(org.cuber.upms.repo.tables.interfaces.ITRcUserRole from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITRcUserRole
     */
    public <E extends org.cuber.upms.repo.tables.interfaces.ITRcUserRole> E into(E into);

    @Override
    public default ITRcUserRole fromJson(io.vertx.core.json.JsonObject json) {
        setUserRoleId(json.getInteger("user_role_id"));
        setUserId(json.getInteger("user_id"));
        setRoleId(json.getInteger("role_id"));
        setStatus(json.getString("status"));
        setOperator(json.getString("operator"));
        // Omitting unrecognized type java.time.LocalDateTime for column update_time!
        // Omitting unrecognized type java.time.LocalDateTime for column create_time!
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("user_role_id",getUserRoleId());
        json.put("user_id",getUserId());
        json.put("role_id",getRoleId());
        json.put("status",getStatus());
        json.put("operator",getOperator());
        // Omitting unrecognized type java.time.LocalDateTime for column update_time!
        // Omitting unrecognized type java.time.LocalDateTime for column create_time!
        return json;
    }

}
