package geekbrains.builders;

import geekbrains.coffee_ingredients.CoffeeIngredients;

public abstract class CoffeeBuilder {
    CoffeeIngredients coffeeIngredients;

    public void prepareCoffe() {
        coffeeIngredients = new CoffeeIngredients();
    }

    public CoffeeIngredients getCoffeIngredients() {
        return coffeeIngredients;
    }

    public abstract void addCoffee();

    public abstract void addCocoa();

    public abstract void addWater();

    public abstract void addSugar();

    public abstract void addMilk();
}
