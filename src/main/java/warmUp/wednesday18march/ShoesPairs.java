package warmUp.wednesday18march;


public class ShoesPairs {
    int calc(String origin) {
        int number = 0;
        int cur = 0;
        for (int i = 0; i < origin.length(); i++) {
            cur += origin.charAt(i) == 'R' ? 1 : -1;
            if (cur == 0) {
                number++;
            }
        }
        return number;
    }
}
