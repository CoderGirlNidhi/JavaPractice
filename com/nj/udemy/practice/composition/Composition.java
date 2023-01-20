package com.nj.udemy.practice.composition;

public class Composition {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell" , "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 * 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);
//        theMonitor.drawPixel(3,2, "red"); // Through this we are showing that we have a monitor class and withh this name as method
//        System.out.println(thePC.getMonitor()); // it will show the location of memory where this function is placed.
//
//        thePC.getMonitor().drawPixel(3,2,"green"); // wherein in this case , we are hiding the private info from outside world.
//        thePC.getMotherboard().loadProgram( " Windos OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

    }
}