package com.nj.udemy.practice.innerclass;

public class InnerClass {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
//        GearBox.Gear first = mcLaren.new Gear(1,12); - only if our inner class is public
//        System.out.println(first.driveSpeed(1000));

        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateCluch(true);
        mcLaren.changeGear(1);
        mcLaren.operateCluch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateCluch(true);
        mcLaren.changeGear(3);
        mcLaren.operateCluch(false);
        System.out.println(mcLaren.wheelSpeed(6000));



    }
}
