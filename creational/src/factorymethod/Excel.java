package factorymethod;

public class Excel implements Document {

    @Override
    public void open() {
        System.out.println("EXCEL OPEN");
    }

    @Override
    public void close() {
        System.out.println("EXCEL CLOSE");
    }

    @Override
    public void save() {
        System.out.println("EXCEL SAVE");
    }
}
