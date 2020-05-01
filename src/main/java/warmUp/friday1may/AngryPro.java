package warmUp.friday1may;

import java.util.Arrays;

public class AngryPro {
    public static void main(String[] args) {
        System.out.println(angryProfessor(4, new int[]{-1, -2, 4, 3}));
    }

    static String angryProfessor(int k, int[] a) {
        return Arrays.stream(a).filter(i -> i <= 0).count() >= k ? "YES" : "NO";

    }
}
