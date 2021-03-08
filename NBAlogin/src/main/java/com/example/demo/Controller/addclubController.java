package com.example.demo.Controller;

import com.example.demo.Server.AddclubServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addclubController {
    @Autowired
    AddclubServer addclubServer;
    @CrossOrigin
    @PostMapping("/NBA_ckub")
    public String AddClub(@RequestParam("club") String club,
                          @RequestParam("Name") String name){
        String s = addclubServer.AddClub(club, name);
        return s;

    }
}
