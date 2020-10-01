package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    Rectangle(){}
    public Rectangle(double width, double length){this.length=length;this.width=width;}
    Rectangle(double width, double length, String color, boolean filled){this.width=width;this.length=length;this.color=color;this.filled=filled;}
    double getWidth(){return this.width;}
    double getLength(){return  this.length;}
    void setWidth(double width){this.width=width;}
    void setLength(double length){this.length=length;}
    @Override
    double getArea() {
        return this.width*this.length;
    }

    @Override
    double getPerimeter() {
        return this.width*2+this.length*2;
    }
    @Override
    public String toString() {
        return getColor()+" "+getWidth()+" "+getLength()+" "+getPerimeter()+" "+getArea();
    }
}
