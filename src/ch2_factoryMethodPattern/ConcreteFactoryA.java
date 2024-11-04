package ch2_factoryMethodPattern;

public class ConcreteFactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
