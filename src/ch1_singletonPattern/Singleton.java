package ch1_singletonPattern;

public class Singleton {
    // 私有静态变量，存储唯一实例
    private static Singleton instance;

    // 私有构造函数，防止外部实例化
    private Singleton() {}

    // 提供静态方法获取实例
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
