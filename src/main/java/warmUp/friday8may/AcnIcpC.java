package warmUp.friday8may;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AcnIcpC {
        static int[] acmTeam(String[] topic) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < topic.length; i++) {
                for (int j = i + 1; j < topic.length; j++) {
                    int i1 = checkTwo(topic[i], topic[j]);
                    if (i1 > max) {
                        max = i1;
                    }
                }

            }
            int x = 0;
            for (int i = 0; i < topic.length; i++) {
                for (int j = i + 1; j < topic.length; j++) {
                    int i1 = checkTwo(topic[i], topic[j]);
                    if (i1 == max) {
                        x++;
                    }
                }

            }
            return new int[]{max, x};
        }

        private static int checkTwo(String s, String s1) {
            char[] chars1 = s.toCharArray();
            char[] chars2 = s1.toCharArray();
            int c = 0;
            for (int i = 0; i < chars1.length; i++) {
                if (Integer.parseInt(String.valueOf(chars1[i])) == 1 || Integer.parseInt(String.valueOf(chars2[i])) == 1) {
                    c++;
                }
            }
            return c;
        }


}
