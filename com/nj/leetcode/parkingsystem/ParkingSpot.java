package com.nj.leetcode.parkingsystem;

public class ParkingSpot {

    public enum Type {
        BIG,
        MEDIUM,
        SMALL
    }

    private final String name;
    private long startTime;
    private final Type type;
    private boolean occupied;

    public ParkingSpot(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public Type getType() {
        return type;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
