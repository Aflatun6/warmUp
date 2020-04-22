package warmUp.wednesday22april;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Mail { //Main
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);

        list.add(2);
        list.add(3);
        int list2 = make(list);
        System.out.println(list2);
    }

    private static int make(List<Integer> list) {

        return IntStream.range(0, list.size()).boxed().map(n -> new BirdType(list.get(n)))
                .max((a1, a2) -> a1.getCount() - a2.getCount())
                .map(n -> new BirdType(n.getValue()))
//                .min((a1,a2) -> a1.get)
                .orElse(new BirdType(0)).getValue();
    }

    private static class BirdType {
        static int count = 0;
        int value;

        public BirdType(int n) {
            value = n;
            count++;
        }

        public int getCount() {
            return count;
        }

        public int getValue() {
            return value;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}

// WRONG!!!!!!!!