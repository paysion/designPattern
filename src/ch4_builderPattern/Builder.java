package ch4_builderPattern;

/**
 * 建造者接口
 */
public interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}
