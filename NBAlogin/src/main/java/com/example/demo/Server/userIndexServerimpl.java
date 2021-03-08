package com.example.demo.Server;

import com.example.demo.Bean.user;
import com.example.demo.DAO.User_lognSelectDAO;
import com.example.demo.Util.JedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class userIndexServerimpl implements userIndexServer {
    @Autowired
    User_lognSelectDAO user_lognSelectDAO;
    @Autowired
    JedisUtils jedisUtils;
    @Override

    public String userIndex(String name, String pwd, String u_email, String u_verification) {

        String s = jedisUtils.jedis_getemail(name);
        if (s!=null&&s.equals(u_verification)){
        String userchongfu = user_lognSelectDAO.userchongfu(name);
        if (userchongfu!=null){
            return "cf";
        }
        user user=new user();
        user.setName(name);
        user.setPassword(pwd);
        user.setEmail(u_email);
        user.setRoleid(4);
        user.setJuleibu("0");
        user_lognSelectDAO.save(user);
        return "ok";
        }
        else {
            return "yzmcw";
        }
    }
}
