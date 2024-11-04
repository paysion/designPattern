package ch2_factoryMethodPattern;

public class ConcreteFactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
