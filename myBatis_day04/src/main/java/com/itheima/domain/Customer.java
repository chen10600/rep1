package com.itheima.domain;

import java.util.Date;

public class Customer {
    private String username;
    private int id;
    private String pwd;
    private Date birthday;
    private String sex;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", pwd='" + pwd + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                '}';
    }
}
