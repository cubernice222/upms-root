package org.cuber.upms.repo.domain;

import javax.persistence.*;

@Entity
@Table(name = "t_rc_user_role")
@SequenceGenerator(name = "SEQ_USER_ROLE_ID", sequenceName = "t_rc_user_role_user_role_id", allocationSize = 1)
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER_ROLE_ID")
    private Integer userRoleId;

    private Integer userId;

    private Integer roleId;

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
