package com.example.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class team_profile {
    @Id
    private int id;
    private  String abbr;
    private  String city;
    private  String city_en;
    private  String  code;
    private  String conference;
    private  String display_abbr;
    private  String display_conference;
    private  String division;
    private  String is_all_star_team;
    private  String is_league_team;
    private  String league_id;
    private  String name;
    private  String name_en;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_en() {
        return city_en;
    }

    public void setCity_en(String city_en) {
        this.city_en = city_en;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDisplay_abbr() {
        return display_abbr;
    }

    public void setDisplay_abbr(String display_abbr) {
        this.display_abbr = display_abbr;
    }

    public String getDisplay_conference() {
        return display_conference;
    }

    public void setDisplay_conference(String display_conference) {
        this.display_conference = display_conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getIs_all_star_team() {
        return is_all_star_team;
    }

    public void setIs_all_star_team(String is_all_star_team) {
        this.is_all_star_team = is_all_star_team;
    }

    public String getIs_league_team() {
        return is_league_team;
    }

    public void setIs_league_team(String is_league_team) {
        this.is_league_team = is_league_team;
    }

    public String getLeague_id() {
        return league_id;
    }

    public void setLeague_id(String league_id) {
        this.league_id = league_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public team_profile() {
    }

    public team_profile(int id, String abbr, String city, String city_en, String code, String conference, String display_abbr, String display_conference, String division, String is_all_star_team, String is_league_team, String league_id, String name, String name_en) {
        this.id = id;
        this.abbr = abbr;
        this.city = city;
        this.city_en = city_en;
        this.code = code;
        this.conference = conference;
        this.display_abbr = display_abbr;
        this.display_conference = display_conference;
        this.division = division;
        this.is_all_star_team = is_all_star_team;
        this.is_league_team = is_league_team;
        this.league_id = league_id;
        this.name = name;
        this.name_en = name_en;
    }
}
