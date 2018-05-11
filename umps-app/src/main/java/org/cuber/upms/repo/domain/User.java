package org.cuber.upms.repo.domain;

import org.cuber.repo.BaseModel;
import org.cuber.repo.OperateDataModel;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_rc_user")
@SequenceGenerator (name = "SEQ_USER_ID", sequenceName = "t_rc_user_user_id_seq", allocationSize = 1)
public class User extends OperateDataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER_ID")
    private Integer userId;

    private String avatar;

    @Column(insertable = false)
    private String userName;

    @Column(insertable = false)
    private String password;

    @Column(insertable = false)
    private String salt;

    private String fullName;

    private LocalDateTime birthday;

    private String sex;

    private String email;

    private String phone;

    private String dingUserId;

    private String wechatUserId;

    private String corpNumber;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDingUserId() {
        return dingUserId;
    }

    public void setDingUserId(String dingUserId) {
        this.dingUserId = dingUserId;
    }

    public String getWechatUserId() {
        return wechatUserId;
    }

    public void setWechatUserId(String wechatUserId) {
        this.wechatUserId = wechatUserId;
    }

    public String getCorpNumber() {
        return corpNumber;
    }

    public void setCorpNumber(String corpNumber) {
        this.corpNumber = corpNumber;
    }


}
