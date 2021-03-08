package com.example.demo.Bean;

public class NBAteam_return {
    private int id;
    private  String abbr;
    private  String name;
    private  String city;
    private  String display_conference;
    private  String division;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public NBAteam_return() {
    }

    public NBAteam_return(int id, String abbr, String name, String city, String display_conference, String division, String name_en) {
        this.id = id;
        this.abbr = abbr;
        this.name = name;
        this.city = city;
        this.display_conference = display_conference;
        this.division = division;
        this.name_en = name_en;
    }
}
