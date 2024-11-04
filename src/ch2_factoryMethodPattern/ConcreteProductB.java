package ch2_factoryMethodPattern;

/**
 * 具体产品类A
 */
public class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("使用产品类B");
    }
}
