package ch2_factoryMethodPattern.example;

/**
 * 具体产品类:拿铁
 */
public class Latte implements Drink{
    @Override
    public void prepare() {
        System.out.println("准备拿铁：蒸牛奶、冲泡浓缩咖啡、混合并加奶泡...");
    }
}
