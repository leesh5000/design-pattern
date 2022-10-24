package factorymethod;

public class PdfFactory implements DocumentFactory {
    @Override
    public Pdf create() {
        return new Pdf();
    }
}
