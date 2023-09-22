public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESe", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerTopings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
//        secondMeal.addBurgerTopings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.printItemizedList();

         MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
         deluxeMeal.addBurgerTopings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
         deluxeMeal.setDrinkSize("SMALL");
         deluxeMeal.printItemizedList();
    }
}