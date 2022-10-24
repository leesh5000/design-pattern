package factorymethod;

public class Pdf implements Document {
    @Override
    public void open() {
        System.out.println("PDF OPEN");
    }

    @Override
    public void close() {
        System.out.println("PDF CLOSE");
    }

    @Override
    public void save() {
        System.out.println("PDF SAVE");
    }
}
