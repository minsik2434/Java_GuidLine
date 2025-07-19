package class_interface.abstract_vs_interface;

public class Client {
    public static void main(String[] args) {
        DataProcessor processor = new UpperCaseDataProcessor();

        processor.initialize();
        String result = processor.process("hello world");

        processor.cleanup();
    }
}
