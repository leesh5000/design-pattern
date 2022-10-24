package abstractfactory.uifactory;

import abstractfactory.scrollbar.AppleScrollBar;
import abstractfactory.scrollbar.ScrollBar;
import abstractfactory.textbox.AppleWindow;
import abstractfactory.textbox.Window;

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
