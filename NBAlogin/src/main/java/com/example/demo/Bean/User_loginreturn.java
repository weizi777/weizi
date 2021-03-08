package com.example.demo.Bean;

import org.springframework.stereotype.Component;

@Component
public class User_loginreturn {
    private int roleid;
    private String juleibu;

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

}
