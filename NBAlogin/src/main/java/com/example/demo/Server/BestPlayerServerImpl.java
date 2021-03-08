package com.example.demo.Server;

import com.example.demo.Bean.BestPlayerReturn;
import com.example.demo.DAO.BestPlayerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BestPlayerServerImpl implements  BestPlayerServer {
    @Autowired
    BestPlayerDao bestPlayerDao;
    @Override
    public List<BestPlayerReturn> bstreturn() {
        List<BestPlayerReturn> bestplayer = bestPlayerDao.bestplayer();
        if (bestplayer.size()>0){
            return  bestplayer;
        }else {
            return null;
        }

    }

    @Override
    public List<BestPlayerReturn> bstreturn(int id) {
        if (id+""!=null){
        List<BestPlayerReturn> bestplayer = bestPlayerDao.bestplayer(id);

        if (bestplayer.size()!=0){

            return  bestplayer;
        }else {
            return null;
        }
        }else {
            return null;
        }
    }
}
