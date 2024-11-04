package ch4_builderPattern;

/**
 * 产品类
 */
public class Product {
    private String partA;
    private String partB;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void show() {
        System.out.println("产品由 " + partA + " 和 " + partB + " 组成");
    }

}
