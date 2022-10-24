package abstractfactory.uifactory;

import abstractfactory.scrollbar.ScrollBar;
import abstractfactory.scrollbar.WindowsScrollBar;
import abstractfactory.textbox.Window;
import abstractfactory.textbox.WindowsWindow;

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
