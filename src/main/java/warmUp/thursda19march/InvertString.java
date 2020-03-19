package warmUp.thursda19march;

public class InvertString {
    // abc -> ABC
    // aBc -> AbC
    // Abc -> aBC
    boolean isSmall(char letter) {
        for (char a = 'a'; a < 'z'; a++) {
            if (letter == a) return true;
        }
        return false;
    }

    String invert(String origin) {
        StringBuilder inverted = new StringBuilder();
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isSmall(chars[i])) {
                inverted.append((char)(chars[i] - 32));
            }
            else{
                inverted.append((char)(chars[i] + 32));
            }
        }
        return inverted.toString();
    }

}