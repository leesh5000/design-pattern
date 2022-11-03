package bridge.refinedabstraction;

import bridge.abstraction.UIToolkit;
import bridge.implementor.UIToolkitImp;

public class AdvancedUIToolkit implements UIToolkit {

    private UIToolkitImp uiToolkitImp;

    public AdvancedUIToolkit(UIToolkitImp uiToolkitImp) {
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

    public void render3D() {
        System.out.println("3D Rendering...");
    }
}
