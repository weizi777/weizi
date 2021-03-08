package com.example.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.Bean.NBAplayer_return;
import com.example.demo.Server.NBAplayerServer;
import com.example.demo.Util.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class NBAplayerConsoller {
    @Autowired
    NBAplayerServer nbAplayerServer;
    @PostMapping("/NBAplayer")
    public  String  NBAplayer(@RequestParam("country") String country){

        List<NBAplayer_return> nbAplayer_returns = nbAplayerServer.NBAplayer_Select(country);
        return JSON.toJSONString(nbAplayer_returns);

    }
}
