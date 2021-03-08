package com.example.demo.Server;

import com.example.demo.Bean.emailreturn;
import com.example.demo.DAO.User_lognSelectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class emailreturnServerimpl implements emailreturnServer{
    @Autowired
    User_lognSelectDAO user_lognSelectDAO;
    @Autowired
    e_mailServer e_mailServer;
    @Override
    public Boolean eamilreturn(String name) {
        emailreturn emailreurn = user_lognSelectDAO.emailreurn(name);
        if (emailreurn!=null){
            String email = emailreurn.getEmail();
           return e_mailServer.sendEmail(email,name);
        }else {
            return false;
        }

    }
}
