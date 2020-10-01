package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){}
    Shape(String color, boolean filled){this.color=color;this.filled=filled;}
    String getColor(){return color;}
    void setColor(String color){this.color=color;}
    boolean isFilled(){return this.filled;}
    void setFilled(boolean filled){this.filled=filled;}
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}
