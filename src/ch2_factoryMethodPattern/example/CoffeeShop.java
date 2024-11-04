package ch2_factoryMethodPattern.example;

/**
 * 客户代码通过工厂来创建饮品，并调用 prepare() 方法进行制作。
 */
public class CoffeeShop {
    public static void main(String[] args) {
        // 创建咖啡工厂并制作咖啡
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Drink coffee = coffeeFactory.createDrink();
        coffee.prepare();

        // 创建拿铁工厂并制作拿铁
        DrinkFactory latteFactory = new LatteFactory();
        Drink latte = latteFactory.createDrink();
        latte.prepare(); // 输出：准备拿铁：蒸牛奶、冲泡浓缩咖啡、混合并加奶泡...

        // 创建卡布奇诺工厂并制作卡布奇诺
        DrinkFactory cappuccinoFactory = new CappuccinoFactory();
        Drink cappuccino = cappuccinoFactory.createDrink();
        cappuccino.prepare(); // 输出：准备卡布奇诺：冲泡浓缩咖啡、加蒸牛奶和厚奶泡...
    }
}
