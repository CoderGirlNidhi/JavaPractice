package com.nj.udemy.practice;

public class Cuboid extends Rectangle{
    private final double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = Math.max(0, height);
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }
}

class Rectangle {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        if(width > 0 ){
            this.width = width;}
        else {
            this.width =0;
        }
        if(length > 0 ){
            this.length = length;}
        else {
            this.length =0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}