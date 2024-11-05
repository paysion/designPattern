package ch6_decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.5;
    }
}
