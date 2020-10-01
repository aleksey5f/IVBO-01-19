package com.company;

public class Planets implements Nameable {
    private String name;
    Planets(String name){this.name=name;}
    void setName(String name){this.name=name;}
    @Override
    public String getName() {
        return this.name;
    }
}
