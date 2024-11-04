package ch1_singletonPattern;

public class Logger {
    // 私有静态变量，存储唯一实例
    private static Logger instance;

    // 私有构造函数，防止外部实例化
    private Logger() {
        // 可以初始化一些资源，比如打开文件流等
        System.out.println("Logger 初始化");
    }

    // 提供静态方法获取实例
    public static Logger getInstance(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // 这个写法错在当首次开始实例化的时候，instance没有赋值，也就是instance没有初始值
    /*public static Logger getInstance(){
        if (instance == null) {
            return new Logger();
        } else {
            return instance;
        }
    }*/

    // 日志记录方法
    public void log(String message){
        System.out.println("Log:"+message);
    }

}
