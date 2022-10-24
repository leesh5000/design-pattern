package abstractfactory.concretefactory;

import abstractfactory.abstractfactory.UIMaker;
import abstractfactory.concreteproduct.AppleScrollBar;
import abstractfactory.abstractproduct.ScrollBar;
import abstractfactory.concreteproduct.AppleWindow;
import abstractfactory.abstractproduct.Window;

public class AppleUIMaker implements UIMaker {

    @Override
    public ScrollBar createScrollBar() {
        return new AppleScrollBar();
    }

    @Override
    public Window createWindow() {
        return new AppleWindow();
    }
}
