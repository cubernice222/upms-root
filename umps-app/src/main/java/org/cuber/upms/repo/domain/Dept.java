package org.cuber.upms.repo.domain;

import org.cuber.repo.OperateDataModel;

import javax.persistence.*;

@Entity
@Table(name = "t_rc_dept")
@SequenceGenerator(name = "SEQ_DEPT_ID", sequenceName = "t_rc_dept_dept_id_seq", allocationSize = 1)
public class Dept extends OperateDataModel{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DEPT_ID")
    private Integer deptId;

    private String simpleName;

    private String fullName;

    private String tips;

    private Integer pDeptId;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Integer getpDeptId() {
        return pDeptId;
    }

    public void setpDeptId(Integer pDeptId) {
        this.pDeptId = pDeptId;
    }
}
