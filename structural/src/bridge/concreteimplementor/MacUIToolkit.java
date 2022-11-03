package bridge.concreteimplementor;

import bridge.implementor.UIToolkitImp;

public class MacUIToolkit implements UIToolkitImp {
    @Override
    public void devDrawLine() {
        System.out.println("Mac Draw Line...");
    }

    @Override
    public void devDrawCircle() {
        System.out.println("Mac Draw Circle...");
    }
}
