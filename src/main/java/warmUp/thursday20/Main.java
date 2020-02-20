package warmUp.thursday20;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder print = new StringBuilder();
        Figure f1 = new Circle(0, 0, 15);
        Figure f2 = new Rectangle(10, 10, 20, 20);
        Figure f3 = new Triangle(0, 0, 10, 0, 10, 10);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(f1);
        figures.add(f2);
        figures.add(f3);
        for (Figure f : figures) {
            f.area();
        }
    }
}
