package com.company;

public class Cars implements Priceable, Nameable {
    private String brand;
    private int price;
    Cars(String brand, int price){this.brand=brand;this.price=price;}
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.brand;
    }
}
