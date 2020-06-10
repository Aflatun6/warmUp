package warmUp.saturday6june;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CavityMap {

    static class Element<A> {
        int r;
        int c;
        A element;

        Element(int r, int c, A a) {
            this.r = r;
            this.c = c;
            this.element = a;
        }
    }

    static String[] cavityMap(String[] grid) {
        int w = grid.length;
        int h = grid[0].length();

        List<Element> list = convert(grid);

//        for (int i = 1; i < w -1; i++) {
//            for (int j = 1; j < h -1; j++) {
//                check()
//            }
//        }

        list.stream().forEach(e -> check(e, w, h));

    return null; // fjkldasfkja;fajf  bad
    }

    private static void check(Element e, int w, int h) {
        if (e.r == 0 || e.r == w) {
        }
        else {

        }
    }

    private static List<Element> convert(String[] grid) {

        List<Element> list = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length(); j++) {
                list.add(new Element<Integer>(i, j, Integer.parseInt(String.valueOf(grid[i].charAt(j)))));
            }
        }
        return list;
    }
}
