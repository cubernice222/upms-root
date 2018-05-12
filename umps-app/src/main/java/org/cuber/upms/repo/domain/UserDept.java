package org.cuber.upms.repo.domain;

import org.cuber.repo.OperateDataModel;

import javax.persistence.*;

@Entity
@Table(name = "t_rc_user_dept")
@SequenceGenerator(name = "SEQ_USER_DEPT_ID", sequenceName = "t_rc_user_dept_user_dept_id", allocationSize = 1)
public class UserDept extends OperateDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER_DEPT_ID")
    private Integer userDeptId;

    private Integer userId;

    private Integer deptId;

    public Integer getUserDeptId() {
        return userDeptId;
    }

    public void setUserDeptId(Integer userDeptId) {
        this.userDeptId = userDeptId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
