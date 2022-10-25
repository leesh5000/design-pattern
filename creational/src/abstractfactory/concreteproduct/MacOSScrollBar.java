package abstractfactory.concreteproduct;

import abstractfactory.abstractproduct.ScrollBar;

/** Concrete Product */
public class MacOSScrollBar implements ScrollBar {

    @Override
    public void render() {
        System.out.println("MacOS Style ScrollBar rendered.");
    }
}
