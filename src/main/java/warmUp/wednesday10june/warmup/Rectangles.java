package warmUp.wednesday10june.warmup;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Rectangles {
    private final Collection<Rectangle> rectangles;

    static Collection<Rectangle> random(int qty) {
        return Stream
                .generate(Rectangle::random)
                .limit(qty)
                .collect(Collectors.toList());
    }

    Rectangles() {
        this(C.RECTANGLES_COUNT);
    }

    Rectangles(int qty) {
        this.rectangles = Rectangles.random(qty);
    }

    long area() {
        long area = 0;
        List<Rectangle> list = list();

        for (int i = 0; i < list.size() - 1; i++) {
            Rectangle l1 = list.get(i);
            Rectangle l2 = list.get(i + 1);
            int area1 = (Math.abs(l1.getP1().x() - l1.getP2().x())) * (Math.abs(l1.getP1().y() - l1.getP2().y()));

            int area2 = (Math.abs(l2.getP1().x() - l2.getP2().x())) * (Math.abs(l2.getP1().y() - l2.getP2().y()));
            int area3 = (Math.abs(l2.getP1().x() - l1.getP1().x())) * (Math.abs(l2.getP1().y() - l1.getP2().y())) *
                    (Math.abs(l2.getP2().x() - l1.getP2().x())) * (Math.abs(l2.getP2().y() - l1.getP2().y()));
            area += area1 + area2 - area3;
        }

        return area;

    }
    public List<Rectangle> list() {

        Rectangles r = new Rectangles();
        return (List<Rectangle>) r.rectangles;
    }
}
