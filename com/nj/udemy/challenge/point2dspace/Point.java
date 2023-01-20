package com.nj.udemy.challenge.point2dspace;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(1, 1);
    }

    public Point(int x, int y) {
        this.x = x; // 6
        this.y = y; // 5
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance1() { // x= 0, y = 0
        Point p = new Point(0, 0);
        return this.distance3(p);
    }

    public double distance2(int x, int y) {
        Point p = new Point(x, y);
        return distance3(p);
    }

    public double distance3(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }
}