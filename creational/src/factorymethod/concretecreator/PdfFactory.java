package factorymethod.concretecreator;

import factorymethod.concreteproduct.Pdf;
import factorymethod.creator.DocumentFactory;

public class PdfFactory implements DocumentFactory {
    @Override
    public Pdf create() {
        return new Pdf();
    }
}
