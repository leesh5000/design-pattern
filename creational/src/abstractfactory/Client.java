package abstractfactory;

import abstractfactory.abstractfactory.UIMaker;
import abstractfactory.abstractproduct.Button;
import abstractfactory.abstractproduct.ScrollBar;
import abstractfactory.concretefactory.MacOSUIMaker;
import abstractfactory.concretefactory.WindowsUIMaker;

import static abstractfactory.OS.MacOS;

public class Client {

    private OS os;
    private UIMaker uiMaker;

    public Client(OS os) {
        this.os = os;
    }

    public OS getOs() {
        return os;
    }

    public void setUiMaker(UIMaker uiMaker) {
        this.uiMaker = uiMaker;
    }

    // 사용자에서 실제 실행할 비즈니스 로직 부분
    public void logic() {
        // 사용자는 UIMaker의 구체적인 서브클래스가 무엇인지 알 필요가 없다.
        // 단지, UIMaker에 자신이 필요로하는 명령만 전달해주면 된다.
        ScrollBar scrollBar = uiMaker.createScrollBar();
        Button button = uiMaker.createButton();
        System.out.println(button.getClass());
        System.out.println(scrollBar.getClass());
    }

    public static void main(String[] args) {

        Client client = new Client(MacOS);

        switch (client.getOs()) {
            case MacOS:
                client.setUiMaker(new MacOSUIMaker());
                break;
            case Windows:
                client.setUiMaker(new WindowsUIMaker());
                break;
            default:
                throw new IllegalArgumentException("지원되지 않는 호스트입니다.");
        }

        client.logic();
    }
}
