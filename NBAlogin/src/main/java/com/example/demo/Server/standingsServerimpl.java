package com.example.demo.Server;

import com.example.demo.Bean.stangingreturn;
import com.example.demo.DAO.standingsDAO;
import com.example.demo.Util.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class standingsServerimpl implements  standingsServer {
    @Autowired
    com.example.demo.DAO.standingsDAO standingsDAO;
    @Override
    public String standingsreturn() {
        List<stangingreturn> standingreturn = standingsDAO.standingreturn();
        if (standingreturn.size()>0){
            return JSONArray.listToJson(standingreturn);
        }{
            return "NO";
        }


    }
}
