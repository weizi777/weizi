package com.example.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class playerprofile {
    @Id
    private int id;
    private  String code;
    private  String country;
    private  String country_en;
    private  String display_affiliation;
    private String display_name;
    private  String display_name_en;
    private  String  dob;
    private  String draft_year;
    private String experience;
    private  String first_initial;
    private  String first_name;
    private  String first_name_en;
    private  String height;
    private  String jersey_no;
    private  String last_name;
    private  String league_id;
    private  String player_id;
    private  String position;
    private  String school_type;
    private  String weight;
    private  String team_id;
    private String team_name;

    public playerprofile() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_en() {
        return country_en;
    }

    public void setCountry_en(String country_en) {
        this.country_en = country_en;
    }

    public String getDisplay_affiliation() {
        return display_affiliation;
    }

    public void setDisplay_affiliation(String display_affiliation) {
        this.display_affiliation = display_affiliation;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getDisplay_name_en() {
        return display_name_en;
    }

    public void setDisplay_name_en(String display_name_en) {
        this.display_name_en = display_name_en;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDraft_year() {
        return draft_year;
    }

    public void setDraft_year(String draft_year) {
        this.draft_year = draft_year;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getFirst_initial() {
        return first_initial;
    }

    public void setFirst_initial(String first_initial) {
        this.first_initial = first_initial;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_name_en() {
        return first_name_en;
    }

    public void setFirst_name_en(String first_name_en) {
        this.first_name_en = first_name_en;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getJersey_no() {
        return jersey_no;
    }

    public void setJersey_no(String jersey_no) {
        this.jersey_no = jersey_no;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLeague_id() {
        return league_id;
    }

    public void setLeague_id(String league_id) {
        this.league_id = league_id;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSchool_type() {
        return school_type;
    }

    public void setSchool_type(String school_type) {
        this.school_type = school_type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}
