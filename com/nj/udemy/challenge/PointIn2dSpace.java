package com.nj.udemy.challenge;

public class PointIn2dSpace {
    private int x;
    private int y;

    public PointIn2dSpace() {
        this(1, 1);
    }

    public PointIn2dSpace(int x, int y) {
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
        PointIn2dSpace p = new PointIn2dSpace(0, 0);
        return this.distance3(p);
    }

    public double distance2(int x, int y) {
        PointIn2dSpace p = new PointIn2dSpace(x, y);
        return distance3(p);
    }

    public double distance3(PointIn2dSpace p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

    public static void main(String[] args) {
//        PointIn2dSpace p1 = new PointIn2dSpace();
        PointIn2dSpace p1 = new PointIn2dSpace(6,5);
        PointIn2dSpace p2 = new PointIn2dSpace(3,1);
        System.out.println("distance(0,0)= " + p1.distance1());
        System.out.println("distance(2,2)= " + p1.distance2(2,2));
        System.out.println("distance()= " + p1.distance3(p2));
        //      PointIn2dSpace p2 = new PointIn2dSpace(3,1);
    }
}