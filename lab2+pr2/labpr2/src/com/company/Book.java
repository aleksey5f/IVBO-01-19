package com.company;

class Book {
    private String author;
    private String name;
    private int year;
    private int numberofpages;
    Book(String a, String n, int y, int nu){this.author=a;this.name=n;this.year=y;this.numberofpages=nu;}
    String getAuthor(){
        return author;
    }
    String getName(){
        return name;
    }
    int getYear(){
        return year;
    }
    int getNumberofpages(){
        return numberofpages;
    }
    void setAuthor(String a){
        this.author=a;
    }
    void setName(String n){
        this.name=n;
    }
    void setYear(int y){
        this.year=y;
    }
    void setNumberofpages(int nu){
        this.numberofpages=nu;
    }



}
