package ch5_adapterPattern;

/**
 * 新的打印类，可以打印 JSON 格式
 */
public class JsonPrinter {
    void printJson(String json) {
        System.out.println("Printing JSON: " + json);
    }
}
