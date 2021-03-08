package com.example.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
/*
* 球队的排行榜
*
* */
@Entity
public class standing {
    @Id
    private int id;
    private  String ahead_at_half_loss;
    private  String ahead_at_half_win;
    private  String ahead_at_third_loss;
    private  String ahead_at_third_win;
    private  String behind_at_half_loss;
    private  String behind_at_half_win;
    private  String behind_at_third_loss;
    private  String behind_at_third_win;
    private  String conf_games_behind;
    private  String conf_loss;
    private  String conf_rank;
    private  String conf_win;
    private  String div_game_behind;
    private  String div_loss;
    private  String div_rank;
    private  String div_win;
    private  String fewer_turnovers_loss;
    private  String fewer_turnovers_win;
    private  String home_loss;
    private  String home_streak;
    private  String home_win;
    private  String last10;
    private  String last10home;
    private  String last10road;
    private  String lead_in_fgpctloss;
    private  String lead_in_fgpctwin;
    private  String lead_in_reb_loss;
    private  String lead_in_reb_win;
    private  String lose_streak;
    private  String losses;
    private  String on_hot_streak;
    private  String oppover500loss;
    private  String oppover500win;
    private  String oppscore100plus_loss;
    private  String oppscore100plus_win;
    private  String otloss;
    private  String otwin;
    private  String points_against;
    private  String points_diff;
    private  String points_for;
    private  String road_loss;
    private  String road_streak;
    private  String road_win;
    private  String score100plus_loss;
    private  String score100plus_win;
    private  String streak;
    private  String ten_pts_or_more_loss;
    private  String ten_pts_or_more_win;
    private  String three_pts_or_less_loss;
    private  String three_pts_or_less_win;
    private  String tied_at_half_loss;
    private  String tied_at_half_win;
    private  String tied_at_third_loss;
    private  String tied_at_third_win;
    private  String win_pct;
    private  String win_streak;
    private  String wins;

    public standing() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAhead_at_half_loss() {
        return ahead_at_half_loss;
    }

    public void setAhead_at_half_loss(String ahead_at_half_loss) {
        this.ahead_at_half_loss = ahead_at_half_loss;
    }

    public String getAhead_at_half_win() {
        return ahead_at_half_win;
    }

    public void setAhead_at_half_win(String ahead_at_half_win) {
        this.ahead_at_half_win = ahead_at_half_win;
    }

    public String getAhead_at_third_loss() {
        return ahead_at_third_loss;
    }

    public void setAhead_at_third_loss(String ahead_at_third_loss) {
        this.ahead_at_third_loss = ahead_at_third_loss;
    }

    public String getAhead_at_third_win() {
        return ahead_at_third_win;
    }

    public void setAhead_at_third_win(String ahead_at_third_win) {
        this.ahead_at_third_win = ahead_at_third_win;
    }

    public String getBehind_at_half_loss() {
        return behind_at_half_loss;
    }

    public void setBehind_at_half_loss(String behind_at_half_loss) {
        this.behind_at_half_loss = behind_at_half_loss;
    }

    public String getBehind_at_half_win() {
        return behind_at_half_win;
    }

    public void setBehind_at_half_win(String behind_at_half_win) {
        this.behind_at_half_win = behind_at_half_win;
    }

    public String getBehind_at_third_loss() {
        return behind_at_third_loss;
    }

    public void setBehind_at_third_loss(String behind_at_third_loss) {
        this.behind_at_third_loss = behind_at_third_loss;
    }

    public String getBehind_at_third_win() {
        return behind_at_third_win;
    }

    public void setBehind_at_third_win(String behind_at_third_win) {
        this.behind_at_third_win = behind_at_third_win;
    }

    public String getConf_games_behind() {
        return conf_games_behind;
    }

    public void setConf_games_behind(String conf_games_behind) {
        this.conf_games_behind = conf_games_behind;
    }

    public String getConf_loss() {
        return conf_loss;
    }

    public void setConf_loss(String conf_loss) {
        this.conf_loss = conf_loss;
    }

    public String getConf_rank() {
        return conf_rank;
    }

    public void setConf_rank(String conf_rank) {
        this.conf_rank = conf_rank;
    }

    public String getConf_win() {
        return conf_win;
    }

    public void setConf_win(String conf_win) {
        this.conf_win = conf_win;
    }

    public String getDiv_game_behind() {
        return div_game_behind;
    }

    public void setDiv_game_behind(String div_game_behind) {
        this.div_game_behind = div_game_behind;
    }

    public String getDiv_loss() {
        return div_loss;
    }

    public void setDiv_loss(String div_loss) {
        this.div_loss = div_loss;
    }

    public String getDiv_rank() {
        return div_rank;
    }

    public void setDiv_rank(String div_rank) {
        this.div_rank = div_rank;
    }

    public String getDiv_win() {
        return div_win;
    }

    public void setDiv_win(String div_win) {
        this.div_win = div_win;
    }

    public String getFewer_turnovers_loss() {
        return fewer_turnovers_loss;
    }

    public void setFewer_turnovers_loss(String fewer_turnovers_loss) {
        this.fewer_turnovers_loss = fewer_turnovers_loss;
    }

    public String getFewer_turnovers_win() {
        return fewer_turnovers_win;
    }

    public void setFewer_turnovers_win(String fewer_turnovers_win) {
        this.fewer_turnovers_win = fewer_turnovers_win;
    }

    public String getHome_loss() {
        return home_loss;
    }

    public void setHome_loss(String home_loss) {
        this.home_loss = home_loss;
    }

    public String getHome_streak() {
        return home_streak;
    }

    public void setHome_streak(String home_streak) {
        this.home_streak = home_streak;
    }

    public String getHome_win() {
        return home_win;
    }

    public void setHome_win(String home_win) {
        this.home_win = home_win;
    }

    public String getLast10() {
        return last10;
    }

    public void setLast10(String last10) {
        this.last10 = last10;
    }

    public String getLast10home() {
        return last10home;
    }

    public void setLast10home(String last10home) {
        this.last10home = last10home;
    }

    public String getLast10road() {
        return last10road;
    }

    public void setLast10road(String last10road) {
        this.last10road = last10road;
    }

    public String getLead_in_fgpctloss() {
        return lead_in_fgpctloss;
    }

    public void setLead_in_fgpctloss(String lead_in_fgpctloss) {
        this.lead_in_fgpctloss = lead_in_fgpctloss;
    }

    public String getLead_in_fgpctwin() {
        return lead_in_fgpctwin;
    }

    public void setLead_in_fgpctwin(String lead_in_fgpctwin) {
        this.lead_in_fgpctwin = lead_in_fgpctwin;
    }

    public String getLead_in_reb_loss() {
        return lead_in_reb_loss;
    }

    public void setLead_in_reb_loss(String lead_in_reb_loss) {
        this.lead_in_reb_loss = lead_in_reb_loss;
    }

    public String getLead_in_reb_win() {
        return lead_in_reb_win;
    }

    public void setLead_in_reb_win(String lead_in_reb_win) {
        this.lead_in_reb_win = lead_in_reb_win;
    }

    public String getLose_streak() {
        return lose_streak;
    }

    public void setLose_streak(String lose_streak) {
        this.lose_streak = lose_streak;
    }

    public String getLosses() {
        return losses;
    }

    public void setLosses(String losses) {
        this.losses = losses;
    }

    public String getOn_hot_streak() {
        return on_hot_streak;
    }

    public void setOn_hot_streak(String on_hot_streak) {
        this.on_hot_streak = on_hot_streak;
    }

    public String getOppover500loss() {
        return oppover500loss;
    }

    public void setOppover500loss(String oppover500loss) {
        this.oppover500loss = oppover500loss;
    }

    public String getOppover500win() {
        return oppover500win;
    }

    public void setOppover500win(String oppover500win) {
        this.oppover500win = oppover500win;
    }

    public String getOppscore100plus_loss() {
        return oppscore100plus_loss;
    }

    public void setOppscore100plus_loss(String oppscore100plus_loss) {
        this.oppscore100plus_loss = oppscore100plus_loss;
    }

    public String getOppscore100plus_win() {
        return oppscore100plus_win;
    }

    public void setOppscore100plus_win(String oppscore100plus_win) {
        this.oppscore100plus_win = oppscore100plus_win;
    }

    public String getOtloss() {
        return otloss;
    }

    public void setOtloss(String otloss) {
        this.otloss = otloss;
    }

    public String getOtwin() {
        return otwin;
    }

    public void setOtwin(String otwin) {
        this.otwin = otwin;
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

    public String getPoints_for() {
        return points_for;
    }

    public void setPoints_for(String points_for) {
        this.points_for = points_for;
    }

    public String getRoad_loss() {
        return road_loss;
    }

    public void setRoad_loss(String road_loss) {
        this.road_loss = road_loss;
    }

    public String getRoad_streak() {
        return road_streak;
    }

    public void setRoad_streak(String road_streak) {
        this.road_streak = road_streak;
    }

    public String getRoad_win() {
        return road_win;
    }

    public void setRoad_win(String road_win) {
        this.road_win = road_win;
    }

    public String getScore100plus_loss() {
        return score100plus_loss;
    }

    public void setScore100plus_loss(String score100plus_loss) {
        this.score100plus_loss = score100plus_loss;
    }

    public String getScore100plus_win() {
        return score100plus_win;
    }

    public void setScore100plus_win(String score100plus_win) {
        this.score100plus_win = score100plus_win;
    }

    public String getStreak() {
        return streak;
    }

    public void setStreak(String streak) {
        this.streak = streak;
    }

    public String getTen_pts_or_more_loss() {
        return ten_pts_or_more_loss;
    }

    public void setTen_pts_or_more_loss(String ten_pts_or_more_loss) {
        this.ten_pts_or_more_loss = ten_pts_or_more_loss;
    }

    public String getTen_pts_or_more_win() {
        return ten_pts_or_more_win;
    }

    public void setTen_pts_or_more_win(String ten_pts_or_more_win) {
        this.ten_pts_or_more_win = ten_pts_or_more_win;
    }

    public String getThree_pts_or_less_loss() {
        return three_pts_or_less_loss;
    }

    public void setThree_pts_or_less_loss(String three_pts_or_less_loss) {
        this.three_pts_or_less_loss = three_pts_or_less_loss;
    }

    public String getThree_pts_or_less_win() {
        return three_pts_or_less_win;
    }

    public void setThree_pts_or_less_win(String three_pts_or_less_win) {
        this.three_pts_or_less_win = three_pts_or_less_win;
    }

    public String getTied_at_half_loss() {
        return tied_at_half_loss;
    }

    public void setTied_at_half_loss(String tied_at_half_loss) {
        this.tied_at_half_loss = tied_at_half_loss;
    }

    public String getTied_at_half_win() {
        return tied_at_half_win;
    }

    public void setTied_at_half_win(String tied_at_half_win) {
        this.tied_at_half_win = tied_at_half_win;
    }

    public String getTied_at_third_loss() {
        return tied_at_third_loss;
    }

    public void setTied_at_third_loss(String tied_at_third_loss) {
        this.tied_at_third_loss = tied_at_third_loss;
    }

    public String getTied_at_third_win() {
        return tied_at_third_win;
    }

    public void setTied_at_third_win(String tied_at_third_win) {
        this.tied_at_third_win = tied_at_third_win;
    }

    public String getWin_pct() {
        return win_pct;
    }

    public void setWin_pct(String win_pct) {
        this.win_pct = win_pct;
    }

    public String getWin_streak() {
        return win_streak;
    }

    public void setWin_streak(String win_streak) {
        this.win_streak = win_streak;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }
}
