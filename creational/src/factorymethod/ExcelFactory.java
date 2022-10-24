package factorymethod;

public class ExcelFactory implements DocumentFactory {
    @Override
    public Excel create() {
        return new Excel();
    }
}
