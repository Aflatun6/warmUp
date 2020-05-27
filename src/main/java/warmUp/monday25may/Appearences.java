package warmUp.monday25may;


import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Appearences {
//    static int alternatingCharacters(String s) {
//        List<Character> list =s.chars().mapToObj(c-> (char) c).collect(Collectors.toList());
//
//        for (int i = 0; i < s.length() - 1; i++) {
//
//            if (s.charAt(i) == 'A') {
//                if (s.charAt(i + 1) == 'A') {
//                    list.remove(i);
//                }
//            }
//            else  {
//                if (s.charAt(i + 1) == 'B') {
//                    list.remove(i);
//                }
//            }
//
//        }
//
//        return s.length() - list.size();
//
//    }

    static class Pair<A, B> {
        final A a;
        final B b;

        public Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }

    }

    static <P, C> P fold(Iterable<C> data, P initial, BiFunction<P, C, P> f) {

        Iterator<C> it = data.iterator();
        P acc = initial;
        while (it.hasNext()) {
            acc = f.apply(acc, it.next());
        }
        return acc;

    }

    static List<Character> sToList(String s) {
        return s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }

    static int alternatingCharacters(String s) {


        BiFunction<
                Pair<Integer, Character>,
                Character,
                Pair<Integer, Character>> f = (p, c) -> p.b != c ? new Pair<>(p.a, c) : new Pair<>(p.a + 1, c);

        return fold(sToList(s), new Pair<>(0, '_'), f).a;

    }


    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAABBB"));
    }
}
