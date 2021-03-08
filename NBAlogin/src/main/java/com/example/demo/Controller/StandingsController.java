package com.example.demo.Controller;

import com.example.demo.Server.standingsServerimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StandingsController {
    @Autowired
    com.example.demo.Server.standingsServer standingsServer;
    @PostMapping("/nba_standings")
    public  String  Standingsreturn(){
        return standingsServer.standingsreturn();
    }
}
