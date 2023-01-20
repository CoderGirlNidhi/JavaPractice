public class SmartKitchen {

public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.getDishwasher().doDishes();
        kitchen.getFridge().orderFood();
        kitchen.getBrewMaker().brewCoffee();

        System.out.println();
        System.out.println();

        kitchen.getBrewMaker().setHasWorkToDo(true);
        kitchen.getFridge().setHasWorkToDo(true);
        kitchen.getDishwasher().setHasWorkToDo(true);

        kitchen.doKitchenWork();







    }

    private Refrigerator fridge;
    private Dishwasher dishwasher;
    private CoffeeMaker brewMaker;

    public SmartKitchen() {
        brewMaker = new CoffeeMaker();
        fridge = new Refrigerator();
        dishwasher = new Dishwasher();
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public CoffeeMaker getBrewMaker() {
        return brewMaker;
    }

    public SmartKitchen(Refrigerator fridge, Dishwasher dishwasher, CoffeeMaker oven) {
        this.fridge = fridge;
        this.dishwasher = dishwasher;
        this.brewMaker = oven;
    }

    private void addWater() {
       brewMaker.setHasWorkToDo(true);
    }

    private void pourMilk() {
        fridge.orderFood();
    }

    private void loadDishwasher() {
        dishwasher.doDishes();
    }

    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishwasher();
        System.out.println("All work done successfully !! ");

    }


}


class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        brewCoffee();

    }

    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Coffee is prepared !");
            hasWorkToDo = false;
        }else {
            System.out.println("Work has not been assigned.");
        }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        orderFood();
    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Ordering food !");
            hasWorkToDo = false;
        }else {
            System.out.println("Work has not been assigned.");
        }
    }

}

 class Dishwasher {

    private boolean hasWorkToDo;

     public void setHasWorkToDo(boolean hasWorkToDo) {
         this.hasWorkToDo = hasWorkToDo;
         doDishes();
     }

     public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Washing Dishes !");
            hasWorkToDo = false;
        }else {
            System.out.println("Work has not been assigned.");
        }
    }
}

