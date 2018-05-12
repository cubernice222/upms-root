package org.cuber.upms.repo.domain;

import org.cuber.repo.OperateDataModel;

import javax.persistence.*;


@Entity
@Table(name = "t_rc_role_menu")
@SequenceGenerator(name = "SEQ_ROLE_MENU_ID", sequenceName = "t_rc_role_menu_role_menu_id", allocationSize = 1)
public class RoleMenu extends OperateDataModel{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ROLE_MENU_ID")
    private Integer roleMenuId;

    private Integer roleId;

    private Integer menuId;

    public Integer getRoleMenuId() {
        return roleMenuId;
    }

    public void setRoleMenuId(Integer roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
