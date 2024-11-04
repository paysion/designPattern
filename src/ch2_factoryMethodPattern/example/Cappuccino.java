package ch2_factoryMethodPattern.example;

/**
 * 具体产品:卡布奇诺
 */
public class Cappuccino implements Drink{
    @Override
    public void prepare() {
        System.out.println("准备卡布奇诺：冲泡浓缩咖啡、加蒸牛奶和厚奶泡...");
    }
}
