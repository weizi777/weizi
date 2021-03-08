package com.example.demo.Server;

import com.example.demo.Bean.User_loginSelect;
import com.example.demo.Bean.User_loginreturn;
import com.example.demo.DAO.User_lognSelectDAO;
import com.example.demo.Util.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class User_lognSelectServerImpl implements User_lognSelectServer {
  @Autowired
  User_lognSelectDAO user_lognSelectDAO;
    @Autowired
  User_loginreturn user_loginreturn;



  List<User_loginreturn> list=new ArrayList<>();
  @Override
  public String user_select(String name,String pwd) {

    User_loginSelect user_loginSelect = user_lognSelectDAO.user_select(name);
      System.out.println(user_loginSelect.getPassword());
    if (user_loginSelect!=null && user_loginSelect.getPassword().equals(pwd)){
        user_loginreturn.setJuleibu(user_loginSelect.getJuleibu());
        user_loginSelect.setRoleid(user_loginSelect.getRoleid());
        list.add(user_loginreturn);
     return JSONArray.listToJson(list);
    }else {
      return "no";
    }
  }
}
