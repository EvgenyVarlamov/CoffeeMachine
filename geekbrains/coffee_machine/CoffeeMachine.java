package geekbrains.coffee_machine;

import geekbrains.builders.CoffeeBuilder;
import geekbrains.coffee_ingredients.CoffeeIngredients;

public class CoffeeMachine {
    private CoffeeBuilder coffeeBuilder;

    public void setCoffe(CoffeeBuilder coffeeBuilder) {
        this.coffeeBuilder = coffeeBuilder;
    }

    public CoffeeIngredients coffeePreparing() {
        coffeeBuilder.prepareCoffe();
        coffeeBuilder.addCoffee();
        coffeeBuilder.addCocoa();
        coffeeBuilder.addWater();
        coffeeBuilder.addSugar();
        coffeeBuilder.addMilk();
        CoffeeIngredients coffeeIngredients = coffeeBuilder.getCoffeIngredients();
        return coffeeIngredients;
    }
}
