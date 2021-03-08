package com.example.demo.Bean;
/*
* 做好的五十大球员数据返回
*
* */
public class BestPlayerReturn {
    private  int playerId;
    private  String Lastname;
    private  String games;
    private String games_started;
    private  String points_pg;//得分
    private  String mins_pg;//分钟
    private  String assists_pg;//助攻
    private  String efficiency;//效率
    private  String ftpct;//罚球
    private  String turnovers_pg;//失误
    private  String tppct;//三分
    private  String rebs_pg;//篮板

    public BestPlayerReturn(int playerId, String lastname, String games, String games_started, String points_pg, String mins_pg, String assists_pg, String efficiency, String ftpct, String turnovers_pg, String tppct, String rebs_pg) {
        this.playerId = playerId;
        Lastname = lastname;
        this.games = games;
        this.games_started = games_started;
        this.points_pg = points_pg;
        this.mins_pg = mins_pg;
        this.assists_pg = assists_pg;
        this.efficiency = efficiency;
        this.ftpct = ftpct;
        this.turnovers_pg = turnovers_pg;
        this.tppct = tppct;
        this.rebs_pg = rebs_pg;
    }

    public BestPlayerReturn() {
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getGames_started() {
        return games_started;
    }

    public void setGames_started(String games_started) {
        this.games_started = games_started;
    }

    public String getPoints_pg() {
        return points_pg;
    }

    public void setPoints_pg(String points_pg) {
        this.points_pg = points_pg;
    }

    public String getMins_pg() {
        return mins_pg;
    }

    public void setMins_pg(String mins_pg) {
        this.mins_pg = mins_pg;
    }

    public String getAssists_pg() {
        return assists_pg;
    }

    public void setAssists_pg(String assists_pg) {
        this.assists_pg = assists_pg;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getFtpct() {
        return ftpct;
    }

    public void setFtpct(String ftpct) {
        this.ftpct = ftpct;
    }

    public String getTurnovers_pg() {
        return turnovers_pg;
    }

    public void setTurnovers_pg(String turnovers_pg) {
        this.turnovers_pg = turnovers_pg;
    }

    public String getTppct() {
        return tppct;
    }

    public void setTppct(String tppct) {
        this.tppct = tppct;
    }

    public String getRebs_pg() {
        return rebs_pg;
    }

    public void setRebs_pg(String rebs_pg) {
        this.rebs_pg = rebs_pg;
    }
}
