package warmUp.thursday27.v2;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DoUnique2 app = new DoUnique2();
        //List<Character> unique = app.getUnique("Hello World");
        //List<Integer> counts = app.countAll("Hello World",unique);
        HashMap<Character,Integer> unique = app.makeUnique("Heloooooolo worlddddd");
        //HASH MAP IS LIKE DICTIONARY IN PYTHON.
        // FIRST ELEMTNTS ARE CHARACTER TYPE AND SECOND ARE INTEGER.


        for(Character c : unique.keySet()){
            System.out.printf(" %s ",c);
        }
        System.out.println();
        for(Integer c : unique.values()){
            System.out.printf(" %d ",c);
        }
        System.out.println();




        ////////////////////////

        DoUnique3 a = new DoUnique3();
        HashMap<Character, Integer> unibro = a.makeUnique("Hello bro!, how are YOu>?");
        unibro.forEach((ch,cnt)-> System.out.printf("%s\t%d\n",ch,cnt));
    }
}
