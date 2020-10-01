package com.company;

public class IntTester {
    public static void main(String[] args){
        Planets planet = new Planets("The Earth");
        Cars car = new Cars("BMW", 2000000);
        System.out.println(planet.getName());
        System.out.print(car.getName()+" "+car.getPrice());
    }
}
