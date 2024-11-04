package ch3_abstractFactoryPattern;

/**
 * 具体产品B1
 */
public class ConcreteProductB1 implements ProductB{
    @Override
    public void display() {
        System.out.println("产品B1");
    }
}
