package abstractfactory;

import abstractfactory.abstractproduct.ScrollBar;
import abstractfactory.abstractproduct.Window;
import abstractfactory.concretefactory.AppleUIMaker;
import abstractfactory.abstractfactory.UIMaker;

public class Client {

    public static void main(String[] args) {

        UIMaker uiMaker = new AppleUIMaker();

        // 사용자는 UIMaker의 구체적인 서브클래스가 무엇인지 알 필요가 없다.
        // 단지, UIMaker에 자신이 필요로하는 명령만 전달해주면 된다.
        Window window = uiMaker.createWindow();
        ScrollBar scrollBar = uiMaker.createScrollBar();

        System.out.println(window.getClass());
        System.out.println(scrollBar.getClass());

    }

}
