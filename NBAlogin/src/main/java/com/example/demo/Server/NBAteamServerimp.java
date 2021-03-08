package com.example.demo.Server;

import com.example.demo.Bean.NBAteam_return;
import com.example.demo.DAO.team_profileDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class NBAteamServerimp implements team_profileServer {
    @Autowired
    com.example.demo.DAO.team_profileDAO team_profileDAO;
    @Override
    public List<NBAteam_return> NBAteam_Select() {
        List<NBAteam_return> selectteam = team_profileDAO.selectteam();
        if (selectteam.size()<0){
            return null;
        }else {
            return selectteam;
        }

    }
}
