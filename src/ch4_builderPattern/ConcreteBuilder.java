package ch4_builderPattern;

/**
 * 具体建造者
 */
public class ConcreteBuilder implements Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("部件A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
