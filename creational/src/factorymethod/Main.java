package factorymethod;

public class Main {
    public static void main(String[] args) {
        Pdf pdf = new PdfFactory().create();
        Excel excel = new ExcelFactory().create();

        // 새로운 요구사항이 생기면 기존 코드를 변경하지 않고
        // ConcreteCreator, ConcreteProduct를 확장해주기만 하면 된다.
        // ...
    }
}