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
public interface ITRcRoleMenu extends VertxPojo, Serializable {

    /**
     * Setter for <code>upms.t_rc_role_menu.role_menu_id</code>.
     */
    public ITRcRoleMenu setRoleMenuId(Integer value);

    /**
     * Getter for <code>upms.t_rc_role_menu.role_menu_id</code>.
     */
    public Integer getRoleMenuId();

    /**
     * Setter for <code>upms.t_rc_role_menu.role_id</code>.
     */
    public ITRcRoleMenu setRoleId(Integer value);

    /**
     * Getter for <code>upms.t_rc_role_menu.role_id</code>.
     */
    public Integer getRoleId();

    /**
     * Setter for <code>upms.t_rc_role_menu.menu_id</code>.
     */
    public ITRcRoleMenu setMenuId(Integer value);

    /**
     * Getter for <code>upms.t_rc_role_menu.menu_id</code>.
     */
    public Integer getMenuId();

    /**
     * Setter for <code>upms.t_rc_role_menu.status</code>.
     */
    public ITRcRoleMenu setStatus(String value);

    /**
     * Getter for <code>upms.t_rc_role_menu.status</code>.
     */
    public String getStatus();

    /**
     * Setter for <code>upms.t_rc_role_menu.operator</code>.
     */
    public ITRcRoleMenu setOperator(String value);

    /**
     * Getter for <code>upms.t_rc_role_menu.operator</code>.
     */
    public String getOperator();

    /**
     * Setter for <code>upms.t_rc_role_menu.update_time</code>.
     */
    public ITRcRoleMenu setUpdateTime(LocalDateTime value);

    /**
     * Getter for <code>upms.t_rc_role_menu.update_time</code>.
     */
    public LocalDateTime getUpdateTime();

    /**
     * Setter for <code>upms.t_rc_role_menu.create_time</code>.
     */
    public ITRcRoleMenu setCreateTime(LocalDateTime value);

    /**
     * Getter for <code>upms.t_rc_role_menu.create_time</code>.
     */
    public LocalDateTime getCreateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITRcRoleMenu
     */
    public void from(org.cuber.upms.repo.tables.interfaces.ITRcRoleMenu from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITRcRoleMenu
     */
    public <E extends org.cuber.upms.repo.tables.interfaces.ITRcRoleMenu> E into(E into);

    @Override
    public default ITRcRoleMenu fromJson(io.vertx.core.json.JsonObject json) {
        setRoleMenuId(json.getInteger("role_menu_id"));
        setRoleId(json.getInteger("role_id"));
        setMenuId(json.getInteger("menu_id"));
        setStatus(json.getString("status"));
        setOperator(json.getString("operator"));
        // Omitting unrecognized type java.time.LocalDateTime for column update_time!
        // Omitting unrecognized type java.time.LocalDateTime for column create_time!
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("role_menu_id",getRoleMenuId());
        json.put("role_id",getRoleId());
        json.put("menu_id",getMenuId());
        json.put("status",getStatus());
        json.put("operator",getOperator());
        // Omitting unrecognized type java.time.LocalDateTime for column update_time!
        // Omitting unrecognized type java.time.LocalDateTime for column create_time!
        return json;
    }

}
