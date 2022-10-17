package geekbrains.builders;

public class ChokoccinoBuilder extends CoffeeBuilder implements BoiledWater {
    @Override
    public void prepareCoffe() {
        super.prepareCoffe();
        System.out.println("Chokoccino");
    }

    @Override
    public void addCoffee() {
        coffeeIngredients.setCoffee("Instant coffee");
    }

    @Override
    public void addCocoa() {
        coffeeIngredients.setCocoa("Cocoa powder");
    }

    @Override
    public void addWater() {
        coffeeIngredients.setWater("Saint Spring");
    }

    @Override
    public void addSugar() {
        coffeeIngredients.setSugar("3 pieces");
    }

    @Override
    public void addMilk() {
        coffeeIngredients.setMilk("milk 2,5%");
    }

    @Override
    public void boiledWater() {
        System.out.println("Water is boiled");
    }
}
