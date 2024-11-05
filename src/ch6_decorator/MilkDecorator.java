package ch6_decorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    /**
     * 这里重写了父类CoffeeDecorator的getDescription()方法,而父类CoffeeDecorator也重写了Coffee的getDescription()方法
     * @return
     */
    @Override
    public String getDescription() {
        // 这里的coffee是父类的coffee
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.5; // 加奶增加的费用
    }
}
