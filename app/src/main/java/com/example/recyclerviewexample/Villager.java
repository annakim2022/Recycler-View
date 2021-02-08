package com.example.recyclerviewexample;

public class Villager {
    // make all instance variables private
    private String name;
    private String birthday;
    private String phrase;
    private String villagerUrl;
    private String houseUrl;

    // constructor
    public Villager(String name, String birthday, String phrase, String villagerUrl, String houseUrl) {
        this.name = name;
        this.birthday = birthday;
        this.phrase = phrase;
        this.villagerUrl = villagerUrl;
        this.houseUrl = houseUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getVillagerUrl() {
        return villagerUrl;
    }

    public void setVillagerUrl(String villagerUrl) {
        this.villagerUrl = villagerUrl;
    }

    public String getHouseUrl() {
        return houseUrl;
    }

    public void setHouseUrl(String houseUrl) {
        this.houseUrl = houseUrl;
    }

    // since everything is private, make public getters/setters to access instance variables

}
