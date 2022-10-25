package abstractfactory.abstractfactory;

import abstractfactory.abstractproduct.Button;
import abstractfactory.abstractproduct.ScrollBar;

/** Abstract Factory */
public interface UIMaker {

    ScrollBar createScrollBar();
    Button createButton();


}
