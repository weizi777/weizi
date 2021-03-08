package com.example.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
最好的5大球员bean
* */
@SuppressWarnings("all")
@Table(name = "stat_average")
@Entity
public class BestPlayer {
    @Id
    private  int playerId;
    private String assistsPg;
    private String blocksPg;
    private String defRebsPg;
    private String efficiency;
    private String fgaPg;
    private String fgmPg;
    private String fgpct;
    private String foulsPg;
    private String ftaPg;
    private String ftmPg;
    private String ftpct;
    private String games;
    private String gamesStarted;
    private String minsPg;
    private String offRebsPg;
    private String pointsPg;
    private String rebsPg;
    private String stealsPg;
    private String tpaPg;
    private String tpmPg;
    private String tppct;
    private String turnoversPg;
    private String lastName;
    private String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAssistsPg() {
        return assistsPg;
    }

    public void setAssistsPg(String assistsPg) {
        this.assistsPg = assistsPg;
    }

    public String getBlocksPg() {
        return blocksPg;
    }

    public void setBlocksPg(String blocksPg) {
        this.blocksPg = blocksPg;
    }

    public String getDefRebsPg() {
        return defRebsPg;
    }

    public void setDefRebsPg(String defRebsPg) {
        this.defRebsPg = defRebsPg;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getFgaPg() {
        return fgaPg;
    }

    public void setFgaPg(String fgaPg) {
        this.fgaPg = fgaPg;
    }

    public String getFgmPg() {
        return fgmPg;
    }

    public void setFgmPg(String fgmPg) {
        this.fgmPg = fgmPg;
    }

    public String getFgpct() {
        return fgpct;
    }

    public void setFgpct(String fgpct) {
        this.fgpct = fgpct;
    }

    public String getFoulsPg() {
        return foulsPg;
    }

    public void setFoulsPg(String foulsPg) {
        this.foulsPg = foulsPg;
    }

    public String getFtaPg() {
        return ftaPg;
    }

    public void setFtaPg(String ftaPg) {
        this.ftaPg = ftaPg;
    }

    public String getFtmPg() {
        return ftmPg;
    }

    public void setFtmPg(String ftmPg) {
        this.ftmPg = ftmPg;
    }

    public String getFtpct() {
        return ftpct;
    }

    public void setFtpct(String ftpct) {
        this.ftpct = ftpct;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(String gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public String getMinsPg() {
        return minsPg;
    }

    public void setMinsPg(String minsPg) {
        this.minsPg = minsPg;
    }

    public String getOffRebsPg() {
        return offRebsPg;
    }

    public void setOffRebsPg(String offRebsPg) {
        this.offRebsPg = offRebsPg;
    }

    public String getPointsPg() {
        return pointsPg;
    }

    public void setPointsPg(String pointsPg) {
        this.pointsPg = pointsPg;
    }

    public String getRebsPg() {
        return rebsPg;
    }

    public void setRebsPg(String rebsPg) {
        this.rebsPg = rebsPg;
    }

    public String getStealsPg() {
        return stealsPg;
    }

    public void setStealsPg(String stealsPg) {
        this.stealsPg = stealsPg;
    }

    public String getTpaPg() {
        return tpaPg;
    }

    public void setTpaPg(String tpaPg) {
        this.tpaPg = tpaPg;
    }

    public String getTpmPg() {
        return tpmPg;
    }

    public void setTpmPg(String tpmPg) {
        this.tpmPg = tpmPg;
    }

    public String getTppct() {
        return tppct;
    }

    public void setTppct(String tppct) {
        this.tppct = tppct;
    }

    public String getTurnoversPg() {
        return turnoversPg;
    }

    public void setTurnoversPg(String turnoversPg) {
        this.turnoversPg = turnoversPg;
    }

    public BestPlayer(String assistsPg, String blocksPg, String defRebsPg, String efficiency, String fgaPg, String fgmPg, String fgpct, String foulsPg, String ftaPg, String ftmPg, String ftpct, String games, String gamesStarted, String minsPg, String offRebsPg, String pointsPg, String rebsPg, String stealsPg, String tpaPg, String tpmPg, String tppct, String turnoversPg,int playerId,String lastName,String rank) {
        this.rank=rank;
        this.lastName=lastName;
        this.playerId=playerId;
        this.assistsPg = assistsPg;
        this.blocksPg = blocksPg;
        this.defRebsPg = defRebsPg;
        this.efficiency = efficiency;
        this.fgaPg = fgaPg;
        this.fgmPg = fgmPg;
        this.fgpct = fgpct;
        this.foulsPg = foulsPg;
        this.ftaPg = ftaPg;
        this.ftmPg = ftmPg;
        this.ftpct = ftpct;
        this.games = games;
        this.gamesStarted = gamesStarted;
        this.minsPg = minsPg;
        this.offRebsPg = offRebsPg;
        this.pointsPg = pointsPg;
        this.rebsPg = rebsPg;
        this.stealsPg = stealsPg;
        this.tpaPg = tpaPg;
        this.tpmPg = tpmPg;
        this.tppct = tppct;
        this.turnoversPg = turnoversPg;
    }

    public BestPlayer() {
    }
}
