package com.example.demo.Controller;

import com.example.demo.Server.BestPlayerServer;
import com.example.demo.Util.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BesterPlayerController {
    @Autowired
    BestPlayerServer bestPlayerServer;

    @PostMapping("/NBA_BesterPLAYER")
    public  String  BesterPlayerReturn(){
        return JSONArray.listToJson(bestPlayerServer.bstreturn());
    }

    @PostMapping("/NBA_BesterPLAYERfenxi")
    public  String BesterPlayerfenxi (@RequestParam("id") int id){

        return bestPlayerServer.bstreturn(id)==null?"no":JSONArray.listToJson(bestPlayerServer.bstreturn(id));
    }

}