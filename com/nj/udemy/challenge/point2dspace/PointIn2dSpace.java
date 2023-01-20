package com.nj.udemy.challenge.point2dspace;

public class PointIn2dSpace {
    public static void main(String[] args) {

//        Point p1 = new Point();

          Point p1 = new Point(6,5);
          Point p2 = new Point (3,1);
          System.out.println("distance(0,0)= " + p1.distance1());
          System.out.println("distance(2,2)= " + p1.distance2(2,2));
          System.out.println("distance()= " + p1.distance3(p2));




    //      Point p2 = new Point(3,1);



    }
}