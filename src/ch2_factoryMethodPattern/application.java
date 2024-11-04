package ch2_factoryMethodPattern;

public class application {
    public static void main(String[] args) {
        // 使用工厂方法创建产品
        ConcreteFactoryA factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.use();
    }
}
