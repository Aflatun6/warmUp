package warmUp.wednesday6may;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AliceThingAgain {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] ranks = new int[alice.length];
        List<Integer> list = Arrays.stream(scores).boxed().distinct().collect(Collectors.toList());


        // for (int i = 0; i < alice.length; i++) {
        //     int finalI = i;
        //     ranks[i] =
        //             (list.size() - (int) (IntStream.range(0, list.size()).filter(x -> alice[finalI] >= list.get(x)).count()) + 1);
        // }

// for (int i = 0; i < alice.length; i++) {
//             for (int j = 0; j < list.size(); j++) {
//                 if (alice[i] >= list.get(j)) {
//                     ranks[i] = j + 1;
//                     break;
//                 } else {
//                     ranks[i] = j + 2;
//                 }
//             }
//         }
///////////////////////////
//         return ranks;
////////////////////////////////////////////////////

        return Arrays.stream(alice)
                .map(x -> (list.size() - (int) (IntStream.range(0, list.size()).filter(y -> x >= list.get(y)).count()) + 1)).toArray();
    }
}
