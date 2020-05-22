package warmUp.monday18may;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Swapping {
//    static int minimumSwaps(int[] arr) {
//        int count = 0;
//        while (unordered(arr)) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > i + 1) {
//                    int temp = arr[i];
//                    arr[i] = arr[arr[i - 1]];
//                    arr[arr[i - 1]] = temp;
//                }
//            }
//            count++;
//        }
//
//
//        return count;
//    }
//
//    private static boolean unordered(int[] arr) {
//        return !Arrays.equals(Arrays.stream(arr).sorted().toArray(), arr);
//    }

    static class Pair<A, B> {
        A a;
        B b;

        public Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }

    static int minimumSwaps(int[] arr) {
        Map<Integer, Integer> collected = IntStream.range(0, arr.length).mapToObj(idx ->
                new Pair<>(idx + 1, arr[idx]))
                .filter(p -> !p.a.equals(p.b))
                .collect(Collectors.toMap(p -> p.a, p -> p.b));

        int step = 0;
        while (!collected.isEmpty()) {
            makeStep(collected);
            step++;
        }
        return step;

    }

    private static void makeStep(Map<Integer, Integer> collected) {
        for (Map.Entry<Integer, Integer> el : collected.entrySet()) {
            int i = el.getKey();
            int v1 = el.getValue();
            int v2 = collected.get(v1);
            collected.remove(i);
            collected.remove(v1);
            if (i != v2) collected.put(i, v2);
            break;
        }
    }


}
