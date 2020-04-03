package warmUp.friday3april;

public class Main {

    static int fix(int[] w) {
        int sum = 0;
        int ar = 0;
        int temporaryNumber = w[0];
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
        }


        ar = (int) sum / w.length;
        if (sum % ar != 0) return -1;
        int count = 0;
        for (int i = 0; i < w.length; i++) {
            while (w[i] != ar) {
                if (w[i] > ar) w[i]--;
                else w[i]++;
                count++;
            }
        }

        return count / 2;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 1, 1, 1, 6};
        int[] a2 = {1, 1, 1, 1, 16};
        int[] a3 = {1, 1, 1, 1, 15};
        int[] a4 = {10, 20, 2, 3, 15};
        System.out.println(fix(a1)); // 4
        System.out.println(fix(a2)); // 12
        System.out.println(fix(a3)); // -1
        System.out.println(fix(a4)); // 15
    }
}
