package com.example.demo.DAO;

import com.example.demo.Bean.BestPlayer;
import com.example.demo.Bean.BestPlayerReturn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BestPlayerDao extends JpaRepository<BestPlayer,Integer> {
    @Query("select new com.example.demo.Bean.BestPlayerReturn(s.playerId,s.lastName,s.games,s.gamesStarted,s.pointsPg,s.minsPg,s.assistsPg,s.efficiency,s.ftaPg,s.turnoversPg,s.tppct,s.rebsPg) from BestPlayer s order by s.rank")
    List<BestPlayerReturn> bestplayer();
    @Query("select new com.example.demo.Bean.BestPlayerReturn(s.playerId,s.lastName,s.games,s.gamesStarted,s.pointsPg,s.minsPg,s.assistsPg,s.efficiency,s.ftaPg,s.turnoversPg,s.tppct,s.rebsPg) from BestPlayer s where s.playerId=:id  order by s.rank")
    List<BestPlayerReturn> bestplayer(int id);
}
