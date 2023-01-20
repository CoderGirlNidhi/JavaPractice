package com.nj.udemy.challenge.billburger2;

public class BillBurger2 {
    public static void main(String[] args) {

//        Item  coke= new Item("drink","coke", 1.50);
////        coke.printItem();
////        coke.setSize("LARGE");
////        coke.printItem();
////
////        Item avacado = new Item("Topping", "avacado", 3.5);
////        avacado.printItem();
////
////        Item avacado1 = new Item("Side", "avacado", 3.5);
////        avacado1.printItem();
////        avacado1.setSize("SMALL");
////        avacado1.printItem();

//        Burger burger = new Burger("Regular", 4.00 );
//        burger.addToppings("CHEESE", "HAM", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addToppings("CHEESE", "BACON", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey","Pepsi", "chili");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
                "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();


    }
}