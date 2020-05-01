package warmUp.friday1may;

public class Clouds {
    static int jumpingOnClouds2(int[] c) {
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

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
    }

    static int jumpingOnClouds(int[] c) {
        return recuring(c, 0, 0);
    }

    private static int recuring(int[] c, int curr, int count) {
        if (curr == c.length - 1) return count;
        if (curr + 2 < c.length && c[curr + 2] == 0) {
            return recuring(c, curr + 2, count + 1);
        }
        else if (curr + 1 < c.length && c[curr + 1] == 0) {
            return recuring(c, curr + 1, count + 1);
        }
        return 0;
    }
}
