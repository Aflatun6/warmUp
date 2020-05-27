package warmUp.wednesday27march;

import java.util.*;
import java.util.stream.Collectors;

public class SpecialString {

    public static void main(String[] args) {
        System.out.println(substrCount(7, "abcbaba"));
    }

    static long substrCount(int n, String s) {
        return n + countIt(s);
    }

    private static int countIt(String s) {
        List<String> subs = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) { // FIND OUT HOW TO GET THESE STRINGS QUICKER !!!!!!!!!!!!!!!!
            for (int j = i + 1; j < s.length(); j++) {
                subs.add(s.substring(i, j + 1));
            }
        }
        return (int) subs.stream().filter(SpecialString::check).count();
    }

    private static boolean check(String ss) {

        List<Character> collect = ss.chars().mapToObj(c -> (char) c).distinct().collect(Collectors.toList());
        if (collect.size() == 1) return true;
        if (collect.size() > 2) return false;
        if (ss.length() % 2 == 0) return false;
        else {
            char character = collect.get(1);
            int mid = ss.length() / 2;
            return ss.charAt(mid) == character;
        }
    }
}
