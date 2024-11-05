package ch5_adapterPattern;

public class AdapterPatternExample {
    public static void main(String[] args) {
        // 使用旧系统类打印
        OldSystemPrinter oldPrinter = new OldSystemPrinter();
        oldPrinter.printText("Hello, World!");

        // 使用适配器模式打印
        JsonPrinter jsonPrinter = new JsonPrinter();
        OldSystemPrinter adapter = new PrinterAdapter(jsonPrinter);
        adapter.printText("Hello, World!");
    }
}
