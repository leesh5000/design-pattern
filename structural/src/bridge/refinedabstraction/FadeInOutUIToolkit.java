package bridge.refinedabstraction;

import bridge.abstraction.UIToolkit;
import bridge.implementor.UIToolkitImp;

public class FadeInOutUIToolkit implements UIToolkit {

    private UIToolkitImp uiToolkitImp;

    public FadeInOutUIToolkit(UIToolkitImp uiToolkitImp) {
        this.uiToolkitImp = uiToolkitImp;
    }

    @Override
    public void drawLine() {
        uiToolkitImp.devDrawLine();
    }

    @Override
    public void drawCircle() {
        uiToolkitImp.devDrawCircle();
    }

    public void fadeInOut() {
        System.out.println("Fade In Out...");
    }

}
