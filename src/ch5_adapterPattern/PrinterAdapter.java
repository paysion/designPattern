package ch5_adapterPattern;

/**
 * 适配器类，实现了将 JSON 打印功能适配到 OldSystemPrinter 接口
 */
public class PrinterAdapter extends OldSystemPrinter {

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
