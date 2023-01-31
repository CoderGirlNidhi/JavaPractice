package com.nj.udemy.practice.collections;

import org.jetbrains.annotations.NotNull;

 public class Seat { //} implements Comparable<Seat> {
    private final String seatName;
    private boolean isReserved = false;

    Seat(String seatNo) {
        this.seatName = seatNo;
    }


    public boolean isReserved() {
        return isReserved;
    }

//    @Override
//    public int compareTo(Seat s) {
//        return this.seatName.compareToIgnoreCase(s.seatName);
////        return this.seatName.compareTo(s.seatName);
//    }

    public boolean reserve() {
        if (this.isReserved) {
            System.out.println("Already reserved.");
            return false;
        }
        this.isReserved = true;
        System.out.println("Reserved " + seatName);
        return true;
    }

    public String getSeatName() {
        return seatName;
    }

    public boolean cancel() {
        if(this.isReserved) {
            this.isReserved = false;
            System.out.println("Reservation of seat " + seatName + " cancelled ");
            return true;
        } else {
            return false;
        }
    }
}
