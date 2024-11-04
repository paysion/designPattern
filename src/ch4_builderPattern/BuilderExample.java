package ch4_builderPattern;

/**
 * 使用建造者模式创建产品
 */
public class BuilderExample {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        Product product = director.construct(builder);
        product.show();
        // builder.buildPartA();
        // builder.buildPartB();
    }
}
