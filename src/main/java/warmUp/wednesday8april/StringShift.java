package warmUp.wednesday8april;

import java.util.Arrays;

public class StringShift {
    public static String shift(String orig, int toLeft, int toRight) {
        char[] chars = orig.toCharArray();
        char[] clone = chars.clone();
        int diff = toRight - toLeft;
        int value = Math.abs(diff) % 4;

        if (diff < 0) {
            for (int i = value; i < chars.length; i++) {
                clone[i - value] = chars[i];
            }
            clone[clone.length - value] = chars[0];
            clone[clone.length - value + 1] = chars[1];
        } else if (diff > 0) {
            for (int i = 0; i <= value; i++) {
                clone[i + value] = chars[i];
            }
            clone[value - 1] = chars[chars.length - 1];
            clone[value - 2] = chars[chars.length - 2];
        }
        String s = Arrays.toString(clone);
        return s;
    }

    public static void main(String[] args) {
        String hEllo = shift("HEllo", 2, 5);
        System.out.println(hEllo);
    }
}