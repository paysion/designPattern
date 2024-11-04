package ch2_factoryMethodPattern.example;

/**
 * 具体产品类:咖啡
 */
public class Coffee implements Drink{
    @Override
    public void prepare() {
        System.out.println("准备咖啡：磨咖啡豆、冲泡咖啡、加糖和牛奶...");
    }
}
