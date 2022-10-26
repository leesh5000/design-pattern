package prototype;

/** Client */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Magazine prototype = new Magazine();
        Magazine magazine;
        for (int i = 0; i < 1000; i++) {
            magazine = (Magazine) prototype.clone();
        }
    }
}
