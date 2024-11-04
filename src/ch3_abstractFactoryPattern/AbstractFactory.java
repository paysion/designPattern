package ch3_abstractFactoryPattern;

/**
 * 抽象工厂接口
 */
public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}
