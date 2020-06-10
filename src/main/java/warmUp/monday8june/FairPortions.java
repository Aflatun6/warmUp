package warmUp.monday8june;

import java.util.Optional;

public class FairPortions {

    static String fairRations(int[] B) {
        int c = 0;
        int odd = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] % 2 != 0) {
                odd++;
            }
        }
        if (odd % 2 != 0) {
            return "NO";
        };

        for (int i = 0; i < B.length - 1; i++) {
            if (B[i] % 2 != 0) {
                B[i]++;
                B[i + 1]++;
                c += 2;
            }
        }
        return String.valueOf(c);

    }

}
