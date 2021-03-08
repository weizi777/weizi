package com.example.demo.Server;

import com.example.demo.Util.JedisUtils;
import com.example.demo.Util.PhoneCodeUtils;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
* 负责的是邮件的发送以及将验证码和用户名存入radis
* 返回值：boole
* 参数为用户名，密码
* */
@Component
public class e_mailServer {
    @Autowired
    JedisUtils jedisUtils;
    //邮箱验证码
    public  boolean sendEmail(String emailaddress,String name){
        try {
            String phoneCode = PhoneCodeUtils.getPhoneCode();
            HtmlEmail email = new HtmlEmail();//不用更改
            email.setHostName("smtp.qq.com");//需要修改，126邮箱为smtp.126.com,163邮箱为163.smtp.com，QQ为smtp.qq.com
            email.setCharset("UTF-8");
            email.addTo(emailaddress);// 收件地址

            email.setFrom("614538852@qq.com", "热爱");//此处填邮箱地址和用户名,用户名可以任意填写

            email.setAuthentication("614538852@qq.com", "fkhsqbncffoqbbha");//此处填写邮箱地址和客户端授权码

            email.setSubject("热爱，只关于篮球");//此处填写邮件名，邮件名可任意填写
            email.setMsg("尊敬的用户您好,您本次登录的验证码是:" + phoneCode+",此验证码有效时长为一分钟");//此处填写邮件内容

            email.send();
            jedisUtils.jedis_puteamil(name,phoneCode);
            jedisUtils.jedis_setExpireTime(name,60);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
