package com.example.demo.Controller;

import com.example.demo.Server.User_lognSelectServer;
import com.example.demo.Server.userIndexServer;
import com.example.demo.Util.JSONArray;
import com.example.demo.Util.JedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserConsoller {
    @Autowired
    com.example.demo.Server.userIndexServer userIndexServer;
    @PostMapping("/NBA_zhuce")
    public String indexReturn(
            @RequestParam("u_Name") String name,
            @RequestParam("u_PWD") String pwd,
            @RequestParam("u_email") String email,
            @RequestParam("u_verification") String u_verification

    ){

        String s = userIndexServer.userIndex(name, pwd, email, u_verification);
        return s;
    }
    @Autowired
    User_lognSelectServer user_lognSelectServer;
    @Autowired
    JedisUtils jedisUtils;

    @PostMapping("/NBA_login")
    public String Ajacretun(
            @RequestParam("u_Name") String name,
            @RequestParam("u_PWD") String pwd,
            @RequestParam("u_email") String u_email

    ){
        if(name==""){
            return "no";
        }
        String s = jedisUtils.jedis_getemail(name);

        if (s!=null&&s.equals(u_email)){
            System.out.println(s);
        return user_lognSelectServer.user_select(name,pwd);
        }else {
            return "no";
        }
    }

}
