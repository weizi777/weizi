package com.example.demo.Server;

import com.example.demo.Bean.NBAplayer_return;
import com.example.demo.DAO.NBAplayerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class NBAplayerServerImpl implements NBAplayerServer {
@Autowired
    NBAplayerDAO nbAplayerDAO;
    @Override

    public List<NBAplayer_return> NBAplayer_Select(String country) {

        List<NBAplayer_return> nbAplayer_returns = nbAplayerDAO.selectPlayer(country);
        if (nbAplayer_returns.size()<0) {
            return null;
        }else {
            return nbAplayer_returns;
        }
    }
}
