package com.company;

public class Plate extends Dish {
    String cleanness="Dirty";
    Plate(String name, String purpose, String color) {
        super(name, purpose, color);
    }
    void setCleanness(){
        this.cleanness="Clean";
    }
}
