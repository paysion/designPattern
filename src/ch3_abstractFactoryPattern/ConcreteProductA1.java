package ch3_abstractFactoryPattern;

/**
 * 具体产品A1
 */
public class ConcreteProductA1 implements ProductA{
    @Override
    public void display() {
        System.out.println("产品A1");
    }
}
