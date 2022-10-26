package adapter.adaptee;

/** Adaptee */
public class TextView implements View {

    public void initBuffer() {
        System.out.println("버퍼 초기화...");
    }

    public void convertFormat() {
        // 텍스트 렌더링을 위한 복잡한 로직을 수행한다고 가정하자.
        System.out.println("복잡한 로직 실행...");
    }

    @Override
    public void render(int x, int y) {
        System.out.printf("%s rendered at pos(%d, %d)%n", this.getClass(), x, y);
    }
}
