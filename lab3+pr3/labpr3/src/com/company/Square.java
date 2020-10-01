package com.company;

public class Square extends Rectangle{
    public Square(){}
    Square(double side){this.length=side;this.width=side;}
    public Square(double side, String color, boolean filled){this.width=side;this.length=side;this.color=color;this.filled=filled;}
    double getSide(){return this.length;}
    void setSide(double side){this.length=side;this.width=side;}
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    void setLength(double side) {
        super.setLength(side);
    }
}
