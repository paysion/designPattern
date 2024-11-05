package ch6_decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // 创建一个简单的咖啡
        Coffee simpleCoffee = new Coffee();
        System.out.println(simpleCoffee.getDescription() + " costs $" + simpleCoffee.getCost());

        // 为咖啡加奶
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " costs $" + milkCoffee.getCost());

        // 为咖啡加奶和糖
        Coffee milkAndSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkAndSugarCoffee.getDescription() + " costs $" + milkAndSugarCoffee.getCost());
    }
}
