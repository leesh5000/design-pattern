package abstractfactory.concreteproduct;

import abstractfactory.abstractproduct.ScrollBar;

/** Concrete Product */
public class WindowsScrollBar implements ScrollBar {
    @Override
    public void render() {
        System.out.println("Windows Style ScrollBar rendered.");
    }
}
