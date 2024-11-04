package ch1_singletonPattern;

public class application {
    public static void main(String[] args) {
        // 获取唯一的 Logger 实例
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // 打印日志信息
        logger1.log("启动应用程序");
        logger2.log("执行某个操作");

        // 验证两个 Logger 实例是否相同(==运算符用于比较两个对象的引用是否相同)
        if (logger1 == logger2) {
            System.out.println("logger1 和 logger2是同一个实例");
        }
    }
}
