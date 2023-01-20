package com.nj.udemy.practice.inheritance;

public class Fish extends Animal {

    private int fins;
    private int gills;

//    public Fish() {
//        super("Salmon", "Big", 2);
//    }

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscle() {
        System.out.println("Muscles moving ");
    }

    private void backFin() {
        System.out.println("Backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscle();

        if(speed == "fast") {
            backFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
