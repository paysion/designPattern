package ch3_abstractFactoryPattern;

/**
 * 具体工厂1
 */
public class ConcreteFactory implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
