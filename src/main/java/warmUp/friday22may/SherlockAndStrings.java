package warmUp.friday22may;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SherlockAndStrings {
    private static final String YES = "YES";
    private static final String NO = "NO";

    static class Pair<A, B> {
        A a;
        B b;

        public Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }

    static String isValid(String s) {
        Map<Character, Long> freq = s.chars().mapToObj(c -> (char) c).collect(
                Collectors.groupingBy(c -> c, Collectors.counting())
        );

        Map<Long, List<Character>> freqInverted = freq.entrySet().stream().collect(
                Collectors.groupingBy(e -> e.getValue(),
                        Collectors.mapping(e -> e.getKey(), Collectors.toList())
                ));

        List<Pair<Long, List<Character>>> m = freqInverted.entrySet().stream()
                .map(e -> new Pair<>(e.getKey(), e.getValue()))
                .sorted((p1, p2) -> Long.compare(p1.a, p2.a))
                .collect(Collectors.toList());

        if (m.size() == 1) return YES;
        if (m.size() > 2) return NO;
        if (m.get(1).a - m.get(0).a == 1 && m.get(1).b.size() == 1) return YES;
        if (m.get(0).a == 1 && m.get(0).b.size() == 1) return YES;
        return NO;

    }


//    static String isValid(String s) {
//        char[] chars = s.toCharArray();
//        Map<Integer, Character> collected = IntStream.range(0, s.length()).boxed()
//                .map(n -> new Pair<Integer, Character>(n + 1, chars[n]))
//                .collect(Collectors.toMap(p -> p.a, p -> p.b));
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.codePoints().distinct().count() * i + 1 == s.length() || s.codePoints().distinct().count() * i == s.length()) {
//                return YES;
//            }
//        }
//        return NO;
//    }
}
