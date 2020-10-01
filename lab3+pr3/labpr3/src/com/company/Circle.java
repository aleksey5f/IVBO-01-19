package com.company;

public class Circle extends Shape {
    double radius;
    Circle(){}
    Circle(double radius){this.radius=radius;}
    Circle(double radius, String color, boolean filled){this.radius=radius;this.color=color;this.filled=filled;}
    double getRadius(){return this.radius;}
    void setRadius(double radius){this.radius=radius;}
    @Override
    double getArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }
    @Override
    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return getRadius()+" "+getColor()+" "+getArea()+" "+getPerimeter();
    }

}
