package abstractfactory.concretefactory;

import abstractfactory.abstractfactory.UIMaker;
import abstractfactory.abstractproduct.Button;
import abstractfactory.abstractproduct.ScrollBar;
import abstractfactory.concreteproduct.WindowsButton;
import abstractfactory.concreteproduct.WindowsScrollBar;

/** Concrete Factory */
public class WindowsUIMaker implements UIMaker {
    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
