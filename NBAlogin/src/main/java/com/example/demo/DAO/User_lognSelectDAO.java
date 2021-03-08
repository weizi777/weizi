package com.example.demo.DAO;

import com.example.demo.Bean.User_loginSelect;
import com.example.demo.Bean.emailreturn;
import com.example.demo.Bean.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
/*
* user表的操作类
* */
public interface User_lognSelectDAO extends JpaRepository<user,Integer> {
    @Query("select new com.example.demo.Bean.User_loginSelect(u.roleid,u.juleibu,u.password) from  user u where u.name=:name")
    User_loginSelect user_select (String name);
    @Query("select new com.example.demo.Bean.emailreturn(u.email) from  user u where u.name=:name")
    emailreturn emailreurn (String name);
    @Query("select u.name from user u where u.name=:name")
    String  userchongfu (String name);
    @Query("select u.juleibu from user u where u.name=:name")
    String  userclubchongfu (String name);

    @Modifying
    @Query(value = "update user set juleibu=?1 where name=?2",nativeQuery = true)
    int addClub(String club,String name);
}
