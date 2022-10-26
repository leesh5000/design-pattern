package prototype;

/** Concrete Prototype */
public class Magazine implements Cloneable {

    private News news;

    public Magazine() {
        this.news = callNetwork();
    }

    private News callNetwork() {
        // 뉴스 정보를 가져오기 위해 네트워크 통신이 일어난다고 가정하자.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new News("오늘 날씨는 맑음입니다.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
