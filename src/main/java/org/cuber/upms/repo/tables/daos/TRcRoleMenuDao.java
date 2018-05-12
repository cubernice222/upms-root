/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.cuber.upms.repo.tables.TRcRoleMenu;
import org.cuber.upms.repo.tables.records.TRcRoleMenuRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRcRoleMenuDao extends DAOImpl<TRcRoleMenuRecord, org.cuber.upms.repo.tables.pojos.TRcRoleMenu, Integer> {

    /**
     * Create a new TRcRoleMenuDao without any configuration
     */
    public TRcRoleMenuDao() {
        super(TRcRoleMenu.T_RC_ROLE_MENU, org.cuber.upms.repo.tables.pojos.TRcRoleMenu.class);
    }

    /**
     * Create a new TRcRoleMenuDao with an attached configuration
     */
    public TRcRoleMenuDao(Configuration configuration) {
        super(TRcRoleMenu.T_RC_ROLE_MENU, org.cuber.upms.repo.tables.pojos.TRcRoleMenu.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(org.cuber.upms.repo.tables.pojos.TRcRoleMenu object) {
        return object.getRoleMenuId();
    }

    /**
     * Fetch records that have <code>role_menu_id IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRoleMenu> fetchByRoleMenuId(Integer... values) {
        return fetch(TRcRoleMenu.T_RC_ROLE_MENU.ROLE_MENU_ID, values);
    }

    /**
     * Fetch a unique record that has <code>role_menu_id = value</code>
     */
    public org.cuber.upms.repo.tables.pojos.TRcRoleMenu fetchOneByRoleMenuId(Integer value) {
        return fetchOne(TRcRoleMenu.T_RC_ROLE_MENU.ROLE_MENU_ID, value);
    }

    /**
     * Fetch records that have <code>role_id IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRoleMenu> fetchByRoleId(Integer... values) {
        return fetch(TRcRoleMenu.T_RC_ROLE_MENU.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>menu_id IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRoleMenu> fetchByMenuId(Integer... values) {
        return fetch(TRcRoleMenu.T_RC_ROLE_MENU.MENU_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRoleMenu> fetchByStatus(String... values) {
        return fetch(TRcRoleMenu.T_RC_ROLE_MENU.STATUS, values);
    }

    /**
     * Fetch records that have <code>operator IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRoleMenu> fetchByOperator(String... values) {
        return fetch(TRcRoleMenu.T_RC_ROLE_MENU.OPERATOR, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRoleMenu> fetchByUpdateTime(Timestamp... values) {
        return fetch(TRcRoleMenu.T_RC_ROLE_MENU.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRoleMenu> fetchByCreateTime(Timestamp... values) {
        return fetch(TRcRoleMenu.T_RC_ROLE_MENU.CREATE_TIME, values);
    }
}
