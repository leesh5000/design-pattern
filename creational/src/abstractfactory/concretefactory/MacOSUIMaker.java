package abstractfactory.concretefactory;

import abstractfactory.abstractfactory.UIMaker;
import abstractfactory.abstractproduct.Button;
import abstractfactory.abstractproduct.ScrollBar;
import abstractfactory.concreteproduct.MacOSButton;
import abstractfactory.concreteproduct.MacOSScrollBar;

/** Concrete Factory */
public class MacOSUIMaker implements UIMaker {

    @Override
    public ScrollBar createScrollBar() {
        return new MacOSScrollBar();
    }

    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
