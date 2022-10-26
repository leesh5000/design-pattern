package adapter.target;

public class Line implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.printf("pos(%d, %d) draw%n", x, y);
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("pos(%d, %d) move%n", x, y);
    }
}
