package warmUp.saturday29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<25;i++){
            list.add((int)(Math.random()*20)-10);
        }
        list.forEach(s-> System.out.println(s));

        List<Integer> neg = list.stream().filter(x-> (x<0)).collect(Collectors.toList());
        neg.forEach(s-> System.out.println(s));
        List<Integer> squareRoots = list.stream().filter(x -> x > 0).map(x -> (int)Math.sqrt(x)).collect(Collectors.toList());
        squareRoots.forEach(s-> System.out.println(s));


    }
}
