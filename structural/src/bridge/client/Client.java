package bridge.client;

import bridge.abstraction.UIToolkit;
import bridge.concreteimplementor.MacUIToolkit;
import bridge.concreteimplementor.WindowsUIToolkit;
import bridge.refinedabstraction.AdvancedUIToolkit;
import bridge.refinedabstraction.FadeInOutUIToolkit;

public class Client {

    public static void main(String[] args) {

        UIToolkit[] uiToolkits = new UIToolkit[2];
        uiToolkits[0] = new AdvancedUIToolkit(new MacUIToolkit());
        uiToolkits[1] = new FadeInOutUIToolkit(new WindowsUIToolkit());

    }

}
