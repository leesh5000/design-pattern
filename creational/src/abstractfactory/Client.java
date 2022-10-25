package abstractfactory;

import abstractfactory.abstractfactory.UIMaker;
import abstractfactory.abstractproduct.ScrollBar;
import abstractfactory.abstractproduct.Button;
import abstractfactory.concretefactory.MacOSUIMaker;
import abstractfactory.concretefactory.WindowsUIMaker;

public class Client {

    public static void main(String[] args) {
        Client client1 = new Client();
        client1.logic(new MacOSUIMaker());

        Client client2 = new Client();
        client2.logic(new WindowsUIMaker());
    }

    // 사용자에서 실제 실행할 비즈니스 로직 부분
    private void logic(UIMaker uiMaker) {
        // 사용자는 UIMaker의 구체적인 서브클래스가 무엇인지 알 필요가 없다.
        // 단지, UIMaker에 자신이 필요로하는 명령만 전달해주면 된다.
        ScrollBar scrollBar = uiMaker.createScrollBar();
        Button button = uiMaker.createButton();
        System.out.println(button.getClass());
        System.out.println(scrollBar.getClass());
    }

}