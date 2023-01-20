package com.nj.udemy.challenge;

public class WallArea {

    public static void main(String[] args) {

//        Wall w1 = new Wall();
        WallArea wall = new WallArea(1.125,-1.0);
        System.out.println("Width= " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());

        wall.setHeight(-1.25);
        wall.setWidth(1);
        System.out.println("Width= " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());


    }

    private double height;
    private double width;

    public WallArea() {
        this(0,0);
    }

    public WallArea(double width, double height) {

        if(width <= 0 ) {
            this.width = 0;
        }else {
            this.width = width;
        }
        if (height <= 0 ) {
            this.height =0;
        } else {
            this.height = height;
        }

    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
        else {
            this.height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0) {
        this.width = width;
    }else {
            this.width = 0;
        }
   }

   public double getArea() {

        return this.height * this.width;
   }
}

