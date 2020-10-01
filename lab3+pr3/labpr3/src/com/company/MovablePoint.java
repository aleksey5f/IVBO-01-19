package com.company;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){this.x=x;this.xSpeed=xSpeed;this.y=y;this.ySpeed=ySpeed;}
    public String toString(){return x+" "+y+" "+xSpeed+" "+ySpeed;}
    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
