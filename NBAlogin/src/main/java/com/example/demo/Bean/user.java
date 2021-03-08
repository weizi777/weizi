package com.example.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user {
    @Id
    private  int userid;
    private String name;
    private String password;
    private String email;
    private int roleid;
    private String juleibu;

    public user(int userid,String name,String password,String email, int roleid,String juleibu) {
        this.userid=userid;
        this.name=name;
        this.password=password;
        this.email=email;
        this.roleid=roleid;
        this.juleibu=juleibu;
    }
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getJuleibu() {
        return juleibu;
    }

    public void setJuleibu(String juleibu) {
        this.juleibu = juleibu;
    }

    public user() {
    }

}
