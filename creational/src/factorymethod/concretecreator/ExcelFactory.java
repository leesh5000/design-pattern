package factorymethod.concretecreator;

import factorymethod.concreteproduct.Excel;
import factorymethod.creator.DocumentFactory;

public class ExcelFactory implements DocumentFactory {
    @Override
    public Excel create() {
        return new Excel();
    }
}
