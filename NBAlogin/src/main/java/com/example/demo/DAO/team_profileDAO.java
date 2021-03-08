package com.example.demo.DAO;

import com.example.demo.Bean.NBAplayer_return;
import com.example.demo.Bean.NBAteam_return;
import com.example.demo.Bean.team_profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface team_profileDAO extends JpaRepository<team_profile,Integer> {
    @Query("select new com.example.demo.Bean.NBAteam_return(t.id,t.abbr,t.name,t.city,t.display_conference,t.division,t.name_en) from  team_profile t ")
    List<NBAteam_return> selectteam();
}
