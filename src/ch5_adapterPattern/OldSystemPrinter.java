package ch5_adapterPattern;

/**
 * 旧系统的打印类，只能打印简单文本
 */
public class OldSystemPrinter {
    void printText(String text) {
        System.out.println("Printing text: " + text);
    }
}
