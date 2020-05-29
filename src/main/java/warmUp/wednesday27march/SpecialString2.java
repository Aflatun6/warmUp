package warmUp.wednesday27march;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialString2 {


    static class Pair {
        Character a;
        int b;

        public Pair(Character a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return String.format("%s:%s", a, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(substrCount(7, "aaaqdgdfdffd"));
    }

    static long substrCount(int n, String s) {
        return countIt(s);
    }

    private static int countIt(String s) {
        List<Pair> pairs = new ArrayList<>();
        char temp = s.charAt(0);
        int count = 1;
        List<Character> list = s.chars().mapToObj(x -> (char) x).collect(Collectors.toList());
        for (int i = 1; i < list.size(); i++) {
            char c = list.get(i);
            if (c == temp) {
                count++;
            } else {
                pairs.add(new Pair(temp, count));
                count = 1;
                temp = c;
            }
            if (i == list.size() - 1)
                pairs.add(new Pair(temp, count));
        }
        pairs.forEach(System.out::println);
        return check(pairs);
    }


    private static int check(List<Pair> pairs) {
        int n = 0;
        Pair temp;
        for (int i = 0; i < pairs.size(); i++) {
            temp = pairs.get(i);
            n = n + (temp.b * (temp.b + 1) / 2);
            if (temp.b == 1) {
                n += tryRec(pairs, i);
            }
        }
        return n;
    }

    private static int tryRec(List<Pair> pairs, int i) {
        if (i - 1 < 0) return 0;
        else {
            Pair left = pairs.get(i - 1);
            return tryRecursion(pairs, i, left.a, 0);
        }
    }

    private static int tryRecursion(List<Pair> pairs, int i, char currChar, int n) {
        int step = n + 1;
        if (i - step < 0) return n;
        if (i + step >= pairs.size()) return n;
        Pair left = pairs.get(i - step);
        Pair right = pairs.get(i + step);
        if (left.a == currChar && right.a == currChar) return tryRecursion(pairs, i, currChar, n + 1);
        return n;
    }
}
