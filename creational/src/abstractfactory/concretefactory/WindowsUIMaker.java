package abstractfactory.concretefactory;

import abstractfactory.abstractfactory.UIMaker;
import abstractfactory.abstractproduct.ScrollBar;
import abstractfactory.concreteproduct.WindowsScrollBar;
import abstractfactory.abstractproduct.Window;
import abstractfactory.concreteproduct.WindowsWindow;

public class WindowsUIMaker implements UIMaker {
    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
