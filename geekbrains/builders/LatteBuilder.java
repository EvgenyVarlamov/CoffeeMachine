package geekbrains.builders;

public class LatteBuilder extends CoffeeBuilder implements BoiledWater {
    @Override
    public void prepareCoffe() {
        super.prepareCoffe();
        System.out.println("Latte");
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
        coffeeIngredients.setWater("Saint Spring");
    }

    @Override
    public void addSugar() {
        coffeeIngredients.setSugar("2 pieces");
    }

    @Override
    public void addMilk() {
        coffeeIngredients.setMilk("milk 3,5%");
    }

    @Override
    public void boiledWater() {
        System.out.println("Water is boiled");
    }
}
