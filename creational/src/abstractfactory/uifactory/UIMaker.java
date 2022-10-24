package abstractfactory.uifactory;

import abstractfactory.scrollbar.ScrollBar;
import abstractfactory.textbox.Window;

public interface UIMaker {

    ScrollBar createScrollBar();
    Window createWindow();


}
