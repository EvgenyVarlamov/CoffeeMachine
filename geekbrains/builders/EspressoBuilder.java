package geekbrains.builders;

public class EspressoBuilder extends CoffeeBuilder implements BoiledWater {
    @Override
    public void prepareCoffe() {
        super.prepareCoffe();
        System.out.println("Espresso");
    }

    @Override
    public void addCoffee() {
        coffeeIngredients.setCoffee("Rabusta");
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
        coffeeIngredients.setMilk("Without Milk");
    }

    @Override
    public void boiledWater() {
        System.out.println("Water is boiled");
    }
}


