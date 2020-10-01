package com.company;

public class Tester {
    public static void main(String[] args){
        Pan pan = new Pan("pan", "frying", "black");
        Plate plate = new Plate("palte", "serving", "white");
        System.out.println(pan.toString());
        System.out.println(plate.toString());
        pan.setColor("white");
        pan.setPurpose("stewing");
        plate.setColor("red");
        System.out.print(pan.toString());
    }
}
