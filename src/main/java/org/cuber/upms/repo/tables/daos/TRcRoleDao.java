/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.cuber.upms.repo.tables.TRcRole;
import org.cuber.upms.repo.tables.records.TRcRoleRecord;
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
public class TRcRoleDao extends DAOImpl<TRcRoleRecord, org.cuber.upms.repo.tables.pojos.TRcRole, Integer> {

    /**
     * Create a new TRcRoleDao without any configuration
     */
    public TRcRoleDao() {
        super(TRcRole.T_RC_ROLE, org.cuber.upms.repo.tables.pojos.TRcRole.class);
    }

    /**
     * Create a new TRcRoleDao with an attached configuration
     */
    public TRcRoleDao(Configuration configuration) {
        super(TRcRole.T_RC_ROLE, org.cuber.upms.repo.tables.pojos.TRcRole.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(org.cuber.upms.repo.tables.pojos.TRcRole object) {
        return object.getRoleId();
    }

    /**
     * Fetch records that have <code>role_id IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRole> fetchByRoleId(Integer... values) {
        return fetch(TRcRole.T_RC_ROLE.ROLE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>role_id = value</code>
     */
    public org.cuber.upms.repo.tables.pojos.TRcRole fetchOneByRoleId(Integer value) {
        return fetchOne(TRcRole.T_RC_ROLE.ROLE_ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRole> fetchByName(String... values) {
        return fetch(TRcRole.T_RC_ROLE.NAME, values);
    }

    /**
     * Fetch records that have <code>role_scope IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRole> fetchByRoleScope(String... values) {
        return fetch(TRcRole.T_RC_ROLE.ROLE_SCOPE, values);
    }

    /**
     * Fetch records that have <code>role IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRole> fetchByRole(String... values) {
        return fetch(TRcRole.T_RC_ROLE.ROLE, values);
    }

    /**
     * Fetch records that have <code>tips IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRole> fetchByTips(String... values) {
        return fetch(TRcRole.T_RC_ROLE.TIPS, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRole> fetchByStatus(String... values) {
        return fetch(TRcRole.T_RC_ROLE.STATUS, values);
    }

    /**
     * Fetch records that have <code>operator IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRole> fetchByOperator(String... values) {
        return fetch(TRcRole.T_RC_ROLE.OPERATOR, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRole> fetchByUpdateTime(Timestamp... values) {
        return fetch(TRcRole.T_RC_ROLE.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcRole> fetchByCreateTime(Timestamp... values) {
        return fetch(TRcRole.T_RC_ROLE.CREATE_TIME, values);
    }
}
