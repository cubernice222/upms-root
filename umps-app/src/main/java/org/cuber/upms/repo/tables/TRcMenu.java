/*
 * This file is generated by jOOQ.
*/
package org.cuber.upms.repo.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.cuber.upms.repo.Indexes;
import org.cuber.upms.repo.Keys;
import org.cuber.upms.repo.Upms;
import org.cuber.upms.repo.tables.records.TRcMenuRecord;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TRcMenu extends TableImpl<TRcMenuRecord> {

    private static final long serialVersionUID = 1316344545;

    /**
     * The reference instance of <code>upms.t_rc_menu</code>
     */
    public static final TRcMenu T_RC_MENU = new TRcMenu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TRcMenuRecord> getRecordType() {
        return TRcMenuRecord.class;
    }

    /**
     * The column <code>upms.t_rc_menu.menu_id</code>.
     */
    public final TableField<TRcMenuRecord, Integer> MENU_ID = createField("menu_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('t_rc_menu_menu_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>upms.t_rc_menu.code</code>. 菜单code
     */
    public final TableField<TRcMenuRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "菜单code");

    /**
     * The column <code>upms.t_rc_menu.p_code</code>. 父菜单code
     */
    public final TableField<TRcMenuRecord, String> P_CODE = createField("p_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "父菜单code");

    /**
     * The column <code>upms.t_rc_menu.name</code>. 菜单名
     */
    public final TableField<TRcMenuRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "菜单名");

    /**
     * The column <code>upms.t_rc_menu.url</code>. 菜单地址
     */
    public final TableField<TRcMenuRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "菜单地址");

    /**
     * The column <code>upms.t_rc_menu.menu_type</code>. 菜单类型 1.菜单,2.按钮
     */
    public final TableField<TRcMenuRecord, String> MENU_TYPE = createField("menu_type", org.jooq.impl.SQLDataType.VARCHAR(2), this, "菜单类型 1.菜单,2.按钮");

    /**
     * The column <code>upms.t_rc_menu.menu_scope</code>. 菜单属性
     */
    public final TableField<TRcMenuRecord, String> MENU_SCOPE = createField("menu_scope", org.jooq.impl.SQLDataType.VARCHAR(64), this, "菜单属性");

    /**
     * The column <code>upms.t_rc_menu.level</code>. 菜单等级
     */
    public final TableField<TRcMenuRecord, Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER, this, "菜单等级");

    /**
     * The column <code>upms.t_rc_menu.sort</code>. 菜单排序
     */
    public final TableField<TRcMenuRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER, this, "菜单排序");

    /**
     * The column <code>upms.t_rc_menu.status</code>.
     */
    public final TableField<TRcMenuRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>upms.t_rc_menu.operator</code>.
     */
    public final TableField<TRcMenuRecord, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>upms.t_rc_menu.update_time</code>.
     */
    public final TableField<TRcMenuRecord, LocalDateTime> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>upms.t_rc_menu.create_time</code>.
     */
    public final TableField<TRcMenuRecord, LocalDateTime> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>upms.t_rc_menu</code> table reference
     */
    public TRcMenu() {
        this(DSL.name("t_rc_menu"), null);
    }

    /**
     * Create an aliased <code>upms.t_rc_menu</code> table reference
     */
    public TRcMenu(String alias) {
        this(DSL.name(alias), T_RC_MENU);
    }

    /**
     * Create an aliased <code>upms.t_rc_menu</code> table reference
     */
    public TRcMenu(Name alias) {
        this(alias, T_RC_MENU);
    }

    private TRcMenu(Name alias, Table<TRcMenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private TRcMenu(Name alias, Table<TRcMenuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Upms.UPMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_UNQ_RC_MENU_CODE, Indexes.T_RC_MENU_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TRcMenuRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_RC_MENU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TRcMenuRecord> getPrimaryKey() {
        return Keys.T_RC_MENU_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TRcMenuRecord>> getKeys() {
        return Arrays.<UniqueKey<TRcMenuRecord>>asList(Keys.T_RC_MENU_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcMenu as(String alias) {
        return new TRcMenu(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRcMenu as(Name alias) {
        return new TRcMenu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TRcMenu rename(String name) {
        return new TRcMenu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TRcMenu rename(Name name) {
        return new TRcMenu(name, null);
    }
}