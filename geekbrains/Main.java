package geekbrains;


import geekbrains.builders.ChokoccinoBuilder;
import geekbrains.builders.FrappeBuilder;
import geekbrains.coffee_ingredients.CoffeeIngredients;
import geekbrains.coffee_machine.*;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine order1 = new CoffeeMachine();
        FrappeBuilder coffee = new FrappeBuilder();
        order1.setCoffe(coffee);
        CoffeeIngredients coffeeIngredients1 = order1.coffeePreparing();
        System.out.println(coffeeIngredients1);
        coffee.mixedIngredients();
        System.out.println();
        CoffeeMachine order2= new CoffeeMachine();
        ChokoccinoBuilder chokocoffee =new ChokoccinoBuilder();
        order2.setCoffe(chokocoffee);
        CoffeeIngredients coffeeIngredients2 = order2.coffeePreparing();
        System.out.println(coffeeIngredients2);
        chokocoffee.boiledWater();
    }
}
