package com.example.demo.Server;

import com.example.demo.DAO.User_lognSelectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class AddclubServerimpl implements  AddclubServer {
    @Autowired
    User_lognSelectDAO user_lognSelectDAO;
    @Override
    public String AddClub(String club,String name) {
        String userclubchongfu = user_lognSelectDAO.userclubchongfu(name);
        if (userclubchongfu.equals("0")) {
            int i = user_lognSelectDAO.addClub(club, name);
            if (i > 0) {
                return "OK";
            } else
                return "NO";
        }
        return  "HAVE";
    }
}
