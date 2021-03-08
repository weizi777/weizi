package com.example.demo.Bean;

public class User_loginSelect {
    private int roleid;
    private String juleibu;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    public  User_loginSelect(){

    }

    public User_loginSelect(int roleid, String juleibu, String password) {
        this.roleid = roleid;
        this.juleibu = juleibu;
        this.password = password;
    }
}
