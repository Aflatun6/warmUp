package warmUp.wednesday1april;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> collect = new Random().ints(10, 50)
                .boxed().limit(30).collect(Collectors.toList());
        LinkedList<Integer> arr = new LinkedList<Integer>(collect);
        int current = 0;
        int next = 0;
        int sum = 999;
        int index = 0;
        for (int i = 0; i < 29; i++) {
            current = collect.get(i);
            next = collect.get(i + 1);
            if (current + next < sum) {
                sum = current + next;
                index = i;
            }
        }
        System.out.println(collect.toString());
        System.out.println("Index is " + index);
        System.out.println("Current is " + collect.get(index));
        System.out.println("Next is " + collect.get(index + 1));
        System.out.println("Sum is " + sum);


    }
}
