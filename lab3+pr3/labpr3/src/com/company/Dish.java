package com.company;

abstract class Dish {
    String name;
    String purpose;
    String color;
    Dish(String name, String purpose, String color){this.color=color;this.name=name;this.purpose=purpose;}
    void setName(String name){this.name=name;}
    void setPurpose(String purpose){this.purpose=purpose;}
    void setColor(String color){this.color=color;}
    String getName(){return name;}
    String getPurpose(){return purpose;}
    String getColor(){return color;}
    public String toString(){return getColor()+" "+getName()+" "+getPurpose();}
}
