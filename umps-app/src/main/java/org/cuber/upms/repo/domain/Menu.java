package org.cuber.upms.repo.domain;

import org.cuber.repo.OperateDataModel;

import javax.persistence.*;

@Entity
@Table(name = "t_rc_menu")
@SequenceGenerator(name = "SEQ_MENU_ID", sequenceName = "t_rc_menu_menu_id_seq", allocationSize = 1)
public class Menu extends OperateDataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MENU_ID")
    private Integer menuId;

    private String code;

    private String pCode;

    private String url;

    private String menuType;

    private String menuScope;

    private int level;

    private int sort;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuScope() {
        return menuScope;
    }

    public void setMenuScope(String menuScope) {
        this.menuScope = menuScope;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
