package com.example.demo.DAO;

import com.example.demo.Bean.NBAplayer_return;
import com.example.demo.Bean.playerprofile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/*
* 球员的jpa实现dao
* */
public interface NBAplayerDAO  extends JpaRepository<playerprofile,Integer> {
    @Query("select new com.example.demo.Bean.NBAplayer_return(p.player_id,p.display_name,p.position,p.height,p.weight,p.experience,p.country,p.team_name) from  playerprofile p where p.team_name=:country")
    List<NBAplayer_return> selectPlayer(String country);
}
