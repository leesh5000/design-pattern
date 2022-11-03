package bridge.concreteimplementor;

import bridge.implementor.UIToolkitImp;

public class WindowsUIToolkit implements UIToolkitImp {
    @Override
    public void devDrawLine() {
        System.out.println("Windows Draw Line...");
    }

    @Override
    public void devDrawCircle() {
        System.out.println("Windows Draw Circle...");
    }
}
