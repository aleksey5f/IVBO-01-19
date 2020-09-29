package com.company;

public class Author {
    private String name;
    private String email;
    private char gender;
    Author(String name, String email, char gender){this.email=email;this.gender=gender;this.name=name;}
    private String getName(){
        return name;
    }
    private String getEmail(){
        return email;
    }
    private char getGender(){
        return gender;
    }
    void setEmail(String email){
        this.email=email;
    }

    public String toString() {
        return getName()+" "+getEmail()+" "+getGender();
    }
}
