package org.cuber.upms.repo.domain;

import org.cuber.repo.OperateDataModel;

import javax.persistence.*;

@Entity
@Table(name = "t_rc_role")
@SequenceGenerator(name = "SEQ_ROLE_ID", sequenceName = "t_rc_role_role_id_seq", allocationSize = 1)
public class Role extends OperateDataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ROLE_ID")
    private Integer roleId;

    private String name;

    private String roleScope;

    private String role;

    private String tips;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleScope() {
        return roleScope;
    }

    public void setRoleScope(String roleScope) {
        this.roleScope = roleScope;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
