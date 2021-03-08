package com.example.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.Bean.NBAplayer_return;
import com.example.demo.Bean.NBAteam_return;
import com.example.demo.Server.NBAplayerServer;
import com.example.demo.Server.team_profileServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class NBAteamConsoller {
    @Autowired
    team_profileServer team_profileServer;
    @PostMapping("/NBAteam")
    public  String  NBAteam(){

        List<NBAteam_return> nbAteam_returns = team_profileServer.NBAteam_Select();
        return JSON.toJSONString(nbAteam_returns);

    }
}
