package ch2_factoryMethodPattern.example;

/**
 * 具体工厂类：拿铁工厂
 */
public class LatteFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Latte();
    }
}
