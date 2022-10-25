package abstractfactory.concreteproduct;

import abstractfactory.abstractproduct.Button;

/** Concrete Product */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Style Button rendered.");
    }
}
