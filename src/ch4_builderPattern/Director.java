package ch4_builderPattern;

/**
 * 指导者类
 */
public class Director {

    public Product construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        return builder.getResult();
    }
}
