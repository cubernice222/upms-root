/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.cuber.upms.repo.tables.TRcMenu;
import org.cuber.upms.repo.tables.records.TRcMenuRecord;
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
public class TRcMenuDao extends DAOImpl<TRcMenuRecord, org.cuber.upms.repo.tables.pojos.TRcMenu, Integer> {

    /**
     * Create a new TRcMenuDao without any configuration
     */
    public TRcMenuDao() {
        super(TRcMenu.T_RC_MENU, org.cuber.upms.repo.tables.pojos.TRcMenu.class);
    }

    /**
     * Create a new TRcMenuDao with an attached configuration
     */
    public TRcMenuDao(Configuration configuration) {
        super(TRcMenu.T_RC_MENU, org.cuber.upms.repo.tables.pojos.TRcMenu.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(org.cuber.upms.repo.tables.pojos.TRcMenu object) {
        return object.getMenuId();
    }

    /**
     * Fetch records that have <code>menu_id IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByMenuId(Integer... values) {
        return fetch(TRcMenu.T_RC_MENU.MENU_ID, values);
    }

    /**
     * Fetch a unique record that has <code>menu_id = value</code>
     */
    public org.cuber.upms.repo.tables.pojos.TRcMenu fetchOneByMenuId(Integer value) {
        return fetchOne(TRcMenu.T_RC_MENU.MENU_ID, value);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByCode(String... values) {
        return fetch(TRcMenu.T_RC_MENU.CODE, values);
    }

    /**
     * Fetch records that have <code>p_code IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByPCode(String... values) {
        return fetch(TRcMenu.T_RC_MENU.P_CODE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByName(String... values) {
        return fetch(TRcMenu.T_RC_MENU.NAME, values);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByUrl(String... values) {
        return fetch(TRcMenu.T_RC_MENU.URL, values);
    }

    /**
     * Fetch records that have <code>menu_type IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByMenuType(String... values) {
        return fetch(TRcMenu.T_RC_MENU.MENU_TYPE, values);
    }

    /**
     * Fetch records that have <code>menu_scope IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByMenuScope(String... values) {
        return fetch(TRcMenu.T_RC_MENU.MENU_SCOPE, values);
    }

    /**
     * Fetch records that have <code>level IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByLevel(Integer... values) {
        return fetch(TRcMenu.T_RC_MENU.LEVEL, values);
    }

    /**
     * Fetch records that have <code>sort IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchBySort(Integer... values) {
        return fetch(TRcMenu.T_RC_MENU.SORT, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByStatus(String... values) {
        return fetch(TRcMenu.T_RC_MENU.STATUS, values);
    }

    /**
     * Fetch records that have <code>operator IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByOperator(String... values) {
        return fetch(TRcMenu.T_RC_MENU.OPERATOR, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByUpdateTime(Timestamp... values) {
        return fetch(TRcMenu.T_RC_MENU.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcMenu> fetchByCreateTime(Timestamp... values) {
        return fetch(TRcMenu.T_RC_MENU.CREATE_TIME, values);
    }
}
