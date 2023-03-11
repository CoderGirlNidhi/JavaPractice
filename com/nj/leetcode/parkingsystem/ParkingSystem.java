package com.nj.leetcode.parkingsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParkingSystem {

    private final int bigSpace;
    private final int mediumSpace;
    private final int smallSpace;

    private final static int PER_MIN_COST_OF_BIG_SPACE = 30;
    private final static int PER_MIN_COST_OF_MEDIUM_SPACE = 20;
    private final static int PER_MIN_COST_OF_SMALL_SPACE = 10;

    private int totalEarnings = 0;

    private final Map<String, ParkingSpot> map;
    private final Stack<ParkingSpot> bigSpaceAvailable ;
    private final Stack<ParkingSpot> mediumSpaceAvailable;
    private final Stack<ParkingSpot> smallSpaceAvailable;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSpace = big;
        this.mediumSpace = medium;
        this.smallSpace = small;
        this.map = new HashMap<>();
        this.bigSpaceAvailable = new Stack<>();
        this.mediumSpaceAvailable = new Stack<>();
        this.smallSpaceAvailable = new Stack<>();

        for (int i = 1; i <= big; i++) {
            String name = "b" + i;
            ParkingSpot a = new ParkingSpot(name, ParkingSpot.Type.BIG);
            map.put(name, a);
            bigSpaceAvailable.push(a);
        }

        for (int i = 1; i <= medium; i++) {
            String name = "m" + i;
            ParkingSpot a = new ParkingSpot(name, ParkingSpot.Type.MEDIUM);
            map.put(name, a);
           mediumSpaceAvailable.push(a);
        }

        for (int i = 1; i <= small; i++) {
            String name = "s" + i;
            ParkingSpot a = new ParkingSpot(name, ParkingSpot.Type.SMALL);
            map.put(name, a);
            smallSpaceAvailable.push(a);
        }
    }

    @Override
    public String toString() {
        return "\nBig : Total = " + bigSpace + " , Available Space = " + bigSpaceAvailable.size() +
                "\nMedium : Total = " + mediumSpace + " , Available Space = " + mediumSpaceAvailable.size() +
                "\nSmall : Total = " + smallSpace + " , Available Space = " + smallSpaceAvailable.size() +
                "\nTotal Earnings = " + totalEarnings + "\n";
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(int totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public boolean addCar(int carType) {
        if(carType == 1 && !bigSpaceAvailable.isEmpty()) {
            ParkingSpot a = bigSpaceAvailable.pop();
            a.setOccupied(true);
            a.setStartTime(System.currentTimeMillis());
            return true;
        } else if (carType == 2 && !mediumSpaceAvailable.isEmpty()) {
            ParkingSpot a = mediumSpaceAvailable.pop();
            a.setOccupied(true);
            a.setStartTime(System.currentTimeMillis());
            return true;
        } else if (carType == 3 && !smallSpaceAvailable.isEmpty()) {
            ParkingSpot a = smallSpaceAvailable.pop();
            a.setOccupied(true);
            a.setStartTime(System.currentTimeMillis());
            return true;
        }
        return false;
    }

    public void removeCar(String spotName) {
        ParkingSpot a = map.get(spotName);
        a.setOccupied(false);
        long start = a.getStartTime();
        long end = System.currentTimeMillis();
        long elapsedMins = (end - start) / (1000);
        a.setStartTime(0);
        ParkingSpot.Type p = a.getType();

        if (p == ParkingSpot.Type.BIG) {
            totalEarnings += PER_MIN_COST_OF_BIG_SPACE * elapsedMins;
            bigSpaceAvailable.push(a);
        } else if (p == ParkingSpot.Type.MEDIUM) {
            totalEarnings += PER_MIN_COST_OF_MEDIUM_SPACE * elapsedMins;
            mediumSpaceAvailable.push(a);
        } else {
            totalEarnings += PER_MIN_COST_OF_SMALL_SPACE * elapsedMins;
            smallSpaceAvailable.push(a);
        }
    }

    public int spacesAvailable(int carType) {
        if (carType == 1) {
            return bigSpaceAvailable.size();
        } else if (carType == 2) {
            return mediumSpaceAvailable.size();
        } else {
            return smallSpaceAvailable.size();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ParkingSystem obj = new ParkingSystem(1,1,0);
        System.out.println(obj);
        System.out.println(obj.addCar(1));
        Thread.sleep(6000);
        System.out.println(obj.addCar(2));
        Thread.sleep(5000);
        System.out.println(obj.addCar(3));
        System.out.println(obj);
        System.out.println(obj.addCar(1));
        obj.removeCar("b1");
        obj.removeCar("m1");
        System.out.println(obj);
    }
}
