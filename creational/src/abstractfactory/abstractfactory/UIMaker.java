package abstractfactory.abstractfactory;

import abstractfactory.abstractproduct.ScrollBar;
import abstractfactory.abstractproduct.Window;

public interface UIMaker {

    ScrollBar createScrollBar();
    Window createWindow();


}
