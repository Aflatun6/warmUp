package warmUp.saturday29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            list.add((int) (Math.random() * 20) - 10);
        }
        List<Integer> list2 = Stream.generate(() -> (int) (Math.random() * 20) - 10).limit(20).collect(Collectors.toList());


        System.out.println("first list " + list.toString());


        List<Integer> neg = list2.stream().filter(x -> (x < 0)).collect(Collectors.toList());

        System.out.println("neg " + neg.toString());
        List<Integer> squareRoots = list2.stream().filter(x -> (x > 0)).map(x -> (int) Math.sqrt(x)).collect(Collectors.toList());


        System.out.println("roots " + squareRoots.toString());

    }
}
