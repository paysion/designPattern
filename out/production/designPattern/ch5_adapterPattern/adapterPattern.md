# 适配器模式

假设我们有一个简单的类 OldSystemPrinter，该类只能打印简单的文本信息。
我们希望在不修改 OldSystemPrinter 类的情况下添加一个新的功能，即能够打印复杂格式的 JSON 信息。

## 一般实现

OldSystemPrinter 类（现有类）
```java
// 旧系统的打印类，只能打印简单文本
class OldSystemPrinter {
    void printText(String text) {
        System.out.println("Printing text: " + text);
    }
}
```
使用 OldSystemPrinter
```java
public class OldSystemPrinterDemo {
    public static void main(String[] args) {
        OldSystemPrinter oldPrinter = new OldSystemPrinter();
        oldPrinter.printText("Hello, World!");
    }
}
```
说明：OldSystemPrinter 只能处理简单的文本字符串，如果我们想打印 JSON 格式的数据，我们需要手动转换它。

## 引入新需求
假设我们现在有一个新的打印需求，需要支持 JSON 格式的打印，我们创建了一个新的类 JsonPrinter，它可以直接处理和打印 JSON 格式。

JsonPrinter 类（新的打印功能）
```java
// 新的打印类，可以打印 JSON 格式
class JsonPrinter {
    void printJson(String json) {
        System.out.println("Printing JSON: " + json);
    }
}
```
## 使用适配器模式

为了在不修改 OldSystemPrinter 类的情况下实现 JSON 打印功能，我们使用适配器模式创建一个适配器类 PrinterAdapter，
将 JSON 打印功能适配到 OldSystemPrinter 的接口中。

PrinterAdapter 类（适配器类）
```java
// 适配器类，实现了将 JSON 打印功能适配到 OldSystemPrinter 接口
class PrinterAdapter extends OldSystemPrinter {
    private JsonPrinter jsonPrinter;

    public PrinterAdapter(JsonPrinter jsonPrinter) {
        this.jsonPrinter = jsonPrinter;
    }

    @Override
    void printText(String text) {
        // 将文本转换为 JSON 格式并使用 JsonPrinter 打印
        String json = "{ \"text\": \"" + text + "\" }";
        jsonPrinter.printJson(json);
    }
}
```

## 客户端使用适配器

```java
public class AdapterPatternExample {
    public static void main(String[] args) {
        // 使用旧系统的打印功能
        OldSystemPrinter oldPrinter = new OldSystemPrinter();
        oldPrinter.printText("Hello, World!");

        // 使用适配器将 JSON 打印功能适配到旧系统
        JsonPrinter jsonPrinter = new JsonPrinter();
        OldSystemPrinter adapter = new PrinterAdapter(jsonPrinter);
        adapter.printText("Hello, JSON World!");
    }
}
```