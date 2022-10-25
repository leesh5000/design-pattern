package abstractfactory.concreteproduct;

import abstractfactory.abstractproduct.Button;

/** Concrete Product */
public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("MacOS Style Button rendered.");
    }
}
