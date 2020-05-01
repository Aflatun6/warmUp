package warmUp.friday1may;

public class Clouds {
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        int curr = 0;
        while (curr < c.length - 1) {
            if (curr + 2 < c.length && c[curr + 2] == 0) {

                curr += 2;
                count++;

            } else if (curr + 1 < c.length && c[curr + 1] == 0) {

                curr++;
                count++;

            }

        }
        return count;
    }

    static int jumpintOnClouds2(int[] c) {
        return recur(c, 0, 0);
    }

    static int recur(int[] c, int curr, int count) {
        if (curr == c.length - 1) return count;
        if (curr + 2 < c.length && c[curr + 2] == 0) {
            return recur(c, curr + 2, count++);
        }
        return recur(c, curr + 1, count++);
    }
}
