package adapter.adapter;

import adapter.adaptee.TextView;
import adapter.target.Shape;

/** Adapter */
public class Text implements Shape {

    private TextView adaptee;

    @Override
    public void draw(int x, int y) {
        adaptee.initBuffer();
        adaptee.convertFormat();
        System.out.printf("pos(%d, %d) draw%n", x, y);
    }

    @Override
    public void move(int x, int y) {
        adaptee.render(x, y);
        System.out.printf("pos(%d, %d) move%n", x, y);
    }
}
