package warmUp.wednesday15april;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[][] a =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                        {17, 18, 19, 20},
                        {21, 22, 23, 24},
                };

        System.out.println(traversed(a.length, a[0].length, a));
    }

    private static String traversed(int R, int C, int[][] a) {
//        return IntStream.range(0, R * C).map(idx -> {
//
//        }).mapToObj(String::valueOf)
//                .collect(Collectors.joining(" "));
        StringJoiner sj = new StringJoiner(" ");
        String s = traversedR(R, C, a, sj, 0, 0, true);
        return s;

    }

    private static String traversedR(int R, int C, int[][] a, StringJoiner sj, int i, int j, boolean right) {
        if (i == R - 1 && j == C - 1) return sj.toString();
        sj.add(String.valueOf(a[i][j]));
        if (i <= j && !right) {
            if (i < R - 1) i++;
            if (j > 0) j--;
            if (i > j) right = true;
        } else if (i >= j && right) {
            if (j < C - 1) j++;
            if (i > 0) i--;
            if (i < j) right = false;
        }
        return traversedR(R, C, a, sj, i, j, right);
    }
}
