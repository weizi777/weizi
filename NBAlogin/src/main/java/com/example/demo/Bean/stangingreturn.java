package com.example.demo.Bean;

public class stangingreturn {
    private  int id;
    private  String wins;
    private  String win_pct;
    private  String streak;
    private  String losses;
    private  String div_game_behind;
    private  String points_for;//得分
    private String points_against;//失分
    private  String points_diff;//分差

    public stangingreturn() {
    }

    public stangingreturn(int id, String wins, String win_pct, String streak, String losses, String div_game_behind, String points_for, String points_against, String points_diff) {
        this.id = id;
        this.wins = wins;
        this.win_pct = win_pct;
        this.streak = streak;
        this.losses = losses;
        this.div_game_behind = div_game_behind;
        this.points_for = points_for;
        this.points_against = points_against;
        this.points_diff = points_diff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public String getWin_pct() {
        return win_pct;
    }

    public void setWin_pct(String win_pct) {
        this.win_pct = win_pct;
    }

    public String getStreak() {
        return streak;
    }

    public void setStreak(String streak) {
        this.streak = streak;
    }

    public String getLosses() {
        return losses;
    }

    public void setLosses(String losses) {
        this.losses = losses;
    }

    public String getDiv_game_behind() {
        return div_game_behind;
    }

    public void setDiv_game_behind(String div_game_behind) {
        this.div_game_behind = div_game_behind;
    }

    public String getPoints_for() {
        return points_for;
    }

    public void setPoints_for(String points_for) {
        this.points_for = points_for;
    }

    public String getPoints_against() {
        return points_against;
    }

    public void setPoints_against(String points_against) {
        this.points_against = points_against;
    }

    public String getPoints_diff() {
        return points_diff;
    }

    public void setPoints_diff(String points_diff) {
        this.points_diff = points_diff;
    }
}
