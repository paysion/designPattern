package ch3_abstractFactoryPattern;

/**
 * 使用抽象工厂创建产品族
 */
public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.display();
        productB.display();
    }
}
