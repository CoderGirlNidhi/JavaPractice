package com.nj.udemy.challenge.composition;

public class Bedroom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall w1, Wall w2, Wall w3, Wall w4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = w1;
        this.wall2 = w2;
        this.wall3 = w3;
        this.wall4 = w4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom - > Making bed | ");
        bed.make();
    }
}
