package adapter.client;

import adapter.adapter.Text;
import adapter.target.Shape;

import java.io.InputStreamReader;

/** Client */
public class DrawingEditor {

    public static void main(String[] args) {

        Shape text = new Text();
        text.draw(10, 10);
        text.move(15, 15);

    }

}
