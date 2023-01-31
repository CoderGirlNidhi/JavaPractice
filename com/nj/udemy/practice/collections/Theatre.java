package com.nj.udemy.practice.collections;

import java.util.*;

public class Theatre {

    public static void main(String[] args) {
        Theatre t = new Theatre("PVR", 4, 3);
//        t.printAllSeats();
        System.out.println(t.reserveSeat("A2"));
        System.out.println(t.reserveSeat("A2"));
//        System.out.println(t.reserveSeat("A6"));

//        Seat s1 = new Seat("A3");
//        Seat s2 = new Seat("B4");
//        MyComparator c = new MyComparator();
//        System.out.println(c.compare(s1, s2));
    }

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int rowCount, int columnCount) {
        this.theatreName = theatreName;

        for (int i = 0; i < rowCount; i++) {
            char rowChar = (char) ('A' + i);
            String row = String.valueOf(rowChar);
            for (int j = 1; j <= columnCount; j++) {
                Seat s = new Seat(row + j);
                seats.add(s);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void printAllSeats() {
        for (Seat s : seats) {
            System.out.print(s.getSeatName() + ", ");
        }
        System.out.println();
    }

//    private Seat checkSeat(String desiredSeatName) {
//        Seat desired = new Seat(desiredSeatName);
//        for (Seat s : seats) {
////            if(s.getSeatName().equalsIgnoreCase(desiredSeatName)) {
////                return s;n
////            }
//            if (s == desired) {
//                return s;
//            }
//        }
//        return null;
//    }

    public boolean reserveSeat(String desiredSeatName) {
        MyComparator c = new MyComparator();

//        Seat s = new Seat(desiredSeatName);
        Seat desiredSeat = new Seat(desiredSeatName);
        int foundSeat = Collections.binarySearch(seats, desiredSeat, c);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat" + desiredSeatName);
            return false;
        }
//        if(s != null) {
//            System.out.println("Valid Seat Number ");
//            boolean isReserved = s.isReserved();
//            if(isReserved) {
//                System.out.println("Seat is already booked");
//                return false;
//            }else {
//                System.out.println("Seat is available");
//                s.reserve();
//                return true;
//            }
//
//        }else {
//            System.out.println("Invalid Seat No");
//            return false;
//        }
    }
}


