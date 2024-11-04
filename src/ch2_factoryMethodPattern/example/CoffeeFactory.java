package ch2_factoryMethodPattern.example;

/**
 * 具体工厂类：咖啡工厂
 */
public class CoffeeFactory implements DrinkFactory {

    @Override
    public Drink createDrink() {
        return new Coffee();
    }
}
