package warmUp.thursday27.v1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DoUnique app = new DoUnique();
        //List<Character> unique = app.getUnique("Hello World");
        //List<Integer> counts = app.countAll("Hello World",unique);
        MakeUnique unique1 = app.makeUnique("Hello worldd");
        List<Character> unique = unique1.unique;
        List<Integer> counts = unique1.counts;


        for(Character c : unique){
            System.out.printf(" %s ",c);
        }
        System.out.println();
        for(Integer c : counts){
            System.out.printf(" %d ",c);
        }
        System.out.println();
    }
}
