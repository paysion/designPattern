package ch2_factoryMethodPattern.example;

/**
 * 具体工厂类：卡布奇诺工厂
 */
public class CappuccinoFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Cappuccino();
    }
}
