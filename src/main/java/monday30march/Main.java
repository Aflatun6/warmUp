package monday30march;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] ints = new Random().ints(10, 25).limit(50).toArray();
        System.out.println(Arrays.toString(ints));
        Map<Integer, Integer> ohh = new HashMap<>();

        for(int i:ints){
            if (!ohh.containsKey(i)) {
                ohh.put(i, 1);
            } else {
                int i1 = ohh.get(i) + 1;
                ohh.put(i, i1);
            }
        }

        for (Integer a : ohh.keySet()) {
            System.out.println(a + " is appeared " + ohh.get(a));
        }
    }
}
