package com.example.demo.Util;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

//这个注解的意思就是说这个类被spring接管了，注册到了容器中
@Component
public class JedisUtils {//这是设置的是缓存的数据库

    private static String PASSWORD ="052036sfz";
    private  static  String ADDRESS="120.53.225.211";
    private  static  int PORT=6379;
    private Jedis jedis;
    public JedisUtils()//这是一个构造方法
    {
        jedis=new Jedis(ADDRESS,PORT);
        jedis.auth(PASSWORD);
        jedis.connect();//连接数据库
    }
    public  void jedis_puteamil(String name,String code){

        jedis.set(name,code);
    }
    public  String jedis_getemail(String name){
        String s=jedis.get(name);
        return  s;
    }
    public  void   jedis_setExpireTime(String key,int time)
    {

        jedis.expire(key,time);
    }

}
