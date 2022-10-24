package factorymethod;

import factorymethod.concretecreator.ExcelFactory;
import factorymethod.concretecreator.PdfFactory;
import factorymethod.creator.DocumentFactory;
import factorymethod.product.Document;

public class Client {

    public static void main(String[] args) {

        Client client1 = new Client();
        client1.logic(new PdfFactory());

        Client client2 = new Client();
        client2.logic(new ExcelFactory());

        // 새로운 요구사항이 생기면 기존 코드를 변경하지 않고
        // ConcreteCreator, ConcreteProduct를 확장해주기만 하면 된다.
        // ...

    }

    private void logic(DocumentFactory documentFactory) {
        Document document = documentFactory.create();
        System.out.println(document.getClass());
    }
}