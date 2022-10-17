package geekbrains.builders;

public class FrappeBuilder extends CoffeeBuilder implements MixedIngredients {
    @Override
    public void prepareCoffe() {
        super.prepareCoffe();
        System.out.println("Frappe");
    }

    @Override
    public void addCoffee() {
        coffeeIngredients.setCoffee("Arabica");
    }

    @Override
    public void addCocoa() {
        coffeeIngredients.setCocoa("Without Cocoa");
    }

    @Override
    public void addWater() {
        coffeeIngredients.setWater("Cone Forest");
    }

    @Override
    public void addSugar() {
        coffeeIngredients.setSugar("3 pieces");
    }

    @Override
    public void addMilk() {
        coffeeIngredients.setMilk("milk 6%");
    }

    @Override
    public void mixedIngredients() {
        System.out.println("All ingredients are mixed");
    }
}
