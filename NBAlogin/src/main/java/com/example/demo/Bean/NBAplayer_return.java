package com.example.demo.Bean;

public class NBAplayer_return {
    private  String player_id;
    private  String display_name;
    private  String position;
    private  String height;
    private  String weight;
    private  String experience;
    private  String country;
    private  String team_name;
    public NBAplayer_return() {
    }

    public NBAplayer_return(String player_id, String display_name, String position, String height, String weight, String experience, String country,String team_name) {
        this.player_id = player_id;
        this.display_name = display_name;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.experience = experience;
        this.country = country;
        this.team_name=team_name;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
