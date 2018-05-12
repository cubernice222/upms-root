/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.cuber.upms.repo.tables.TRcUserDept;
import org.cuber.upms.repo.tables.records.TRcUserDeptRecord;
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
public class TRcUserDeptDao extends DAOImpl<TRcUserDeptRecord, org.cuber.upms.repo.tables.pojos.TRcUserDept, Integer> {

    /**
     * Create a new TRcUserDeptDao without any configuration
     */
    public TRcUserDeptDao() {
        super(TRcUserDept.T_RC_USER_DEPT, org.cuber.upms.repo.tables.pojos.TRcUserDept.class);
    }

    /**
     * Create a new TRcUserDeptDao with an attached configuration
     */
    public TRcUserDeptDao(Configuration configuration) {
        super(TRcUserDept.T_RC_USER_DEPT, org.cuber.upms.repo.tables.pojos.TRcUserDept.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(org.cuber.upms.repo.tables.pojos.TRcUserDept object) {
        return object.getUserDeptId();
    }

    /**
     * Fetch records that have <code>user_dept_id IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcUserDept> fetchByUserDeptId(Integer... values) {
        return fetch(TRcUserDept.T_RC_USER_DEPT.USER_DEPT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_dept_id = value</code>
     */
    public org.cuber.upms.repo.tables.pojos.TRcUserDept fetchOneByUserDeptId(Integer value) {
        return fetchOne(TRcUserDept.T_RC_USER_DEPT.USER_DEPT_ID, value);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcUserDept> fetchByUserId(Integer... values) {
        return fetch(TRcUserDept.T_RC_USER_DEPT.USER_ID, values);
    }

    /**
     * Fetch records that have <code>dept_id IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcUserDept> fetchByDeptId(Integer... values) {
        return fetch(TRcUserDept.T_RC_USER_DEPT.DEPT_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcUserDept> fetchByStatus(String... values) {
        return fetch(TRcUserDept.T_RC_USER_DEPT.STATUS, values);
    }

    /**
     * Fetch records that have <code>operator IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcUserDept> fetchByOperator(String... values) {
        return fetch(TRcUserDept.T_RC_USER_DEPT.OPERATOR, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcUserDept> fetchByUpdateTime(Timestamp... values) {
        return fetch(TRcUserDept.T_RC_USER_DEPT.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<org.cuber.upms.repo.tables.pojos.TRcUserDept> fetchByCreateTime(Timestamp... values) {
        return fetch(TRcUserDept.T_RC_USER_DEPT.CREATE_TIME, values);
    }
}
