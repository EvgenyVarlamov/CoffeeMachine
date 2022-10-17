package geekbrains.coffee_ingredients;

public class CoffeeIngredients {
    private String coffee;
    private String cocoa;
    private String water;
    private String sugar;
    private String milk;

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public void setCocoa(String cocoa) {
        this.cocoa = cocoa;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Ingredients:[" +
                "coffee='" + coffee + '\'' +
                ", cocoa='" + cocoa + '\'' +
                ", water='" + water + '\'' +
                ", sugar='" + sugar + '\'' +
                ", milk='" + milk + '\'' +
                ']';
    }
}
