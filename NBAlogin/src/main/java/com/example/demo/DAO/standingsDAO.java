package com.example.demo.DAO;

import com.example.demo.Bean.standing;
import com.example.demo.Bean.stangingreturn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface standingsDAO extends JpaRepository<standing, Integer> {
    @Query("select new com.example.demo.Bean.stangingreturn(s.id,s.wins,s.win_pct,s.streak,s.losses,s.div_game_behind,s.points_for,s.points_against,s.points_diff) from  standing s")
    List<stangingreturn> standingreturn ();
}
