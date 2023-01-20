package com.nj.udemy.challenge.carpetcost;

public class Floor {
    private final double width;
    private final double length;

    public Floor (double width, double length) {
        this.width = Math.max(0, width);
        this.length = Math.max(0, length);
    }

    public double getArea() {
        return this.width * this.length;
    }
}
