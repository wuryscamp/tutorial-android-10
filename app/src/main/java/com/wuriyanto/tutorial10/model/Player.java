package com.wuriyanto.tutorial10.model;

/**
 * Created by wurianto on 3/10/18.
 */

public class Player {

    private String name;
    private String position;
    private String nationality;

    public Player(){}

    public Player(String name, String position, String nationality){
        this.name = name;
        this.position = position;
        this.nationality = nationality;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }
}
