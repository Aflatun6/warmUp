package warmUp.monday6april;

import java.util.*;

public class Main {
    public static int cover(List<Integer> park,int n, int k) {
        int a = 0;
//        int[][] possible = new int[n][n];
//        for (int i = 0; i < park.size(); i++) {
//            if(i==1){
//                a++;
//            }
//        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of cars");
        int n = in.nextInt();
        System.out.println("Enter the number of cars that should be covered");
        int k = in.nextInt();
        int count = 0;
        List<Integer> park = new ArrayList<>();
        for (int i = 0; count < n; i++) {
            park.add(0);
            if ((int) (Math.random() * 3) == 1) {
                park.add(1);
                count++;
            }
        }
        park.forEach(System.out::println);


    }
}
