package warmUp.monday1june;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GoodPluses {

    public static void main(String[] args) {
        String[] s = {
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "GGGGGG",
                "BGBBGB",
                "BGBBGB"
        };
        System.out.println(twoPluses(s));
    }

    static class Pair {
        int a;
        int b;
        char c;

        Pair(int a, int b, char c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (o == this) return true;
//            if (!(o instanceof Pair)) return false;
//            Pair that = (Pair) o;
//            return (that.a == this.a && that.b == this.b);
//
//        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a == pair.a &&
                    b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    static int twoPluses(String[] grid) {
        List<Pair> pairList = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length(); j++) {
                if (grid[i].charAt(j) == 'G') {
                    pairList.add(new Pair(i, j, grid[i].charAt(j)));
                }
            }
        }

        List<Integer> collected = pairList.stream().map(pair -> doIt(pairList, pair, grid)).sorted((a1, a2) -> a2 - a1).collect(Collectors.toList());
        return collected.get(0) * collected.get(1);

    }

    private static int doIt(List<Pair> list, Pair pair, String[] grid) {

        int number = doItRec(list, pair, 1, grid);
        return ((number - 1) * 4 + 1);
    }

    private static int doItRec(List<Pair> list, Pair pair, int n, String[] grid) {
        if (pair.a - (n + 1) < 0) return n;
        if (pair.a + (n + 1) > grid.length) return n;
        if (pair.b - (n + 1) < 0) return n;
        if (pair.b + (n + 1) > grid[0].length()) return n;
        /////////////////////// CHECK IF THERE ARE A PAIR;
        Pair left = new Pair(pair.a - (n + 1), pair.b, 'G');
        Pair right = new Pair(pair.a + (n + 1), pair.b, 'G');
        Pair up = new Pair(pair.a, pair.b + (n + 1), 'G');
        Pair down = new Pair(pair.a, pair.b - (n + 1), 'G');
        List<Pair> sides = new ArrayList<Pair>() {{
            add(left);
            add(right);
            add(down);
            add(up);
        }};
        if (list.containsAll(sides))
            return doItRec(list, pair, n + 1, grid);
        return n;
    }

}
