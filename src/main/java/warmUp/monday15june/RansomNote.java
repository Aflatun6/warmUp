package warmUp.monday15june;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RansomNote {
    public static void main(String[] args) {
        checkMagazine(new String[]{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"},
                new String[]{"ive", "got", "some", "coconuts"});
    }

    static void checkMagazine(String[] magazine, String[] note) {

        boolean b = Arrays.stream(magazine).collect(Collectors.toList()).containsAll(Arrays.stream(note).collect(Collectors.toList()));

//        Arrays.stream(magazine).flatMap(m->{
//            Arrays.stream(note).map(n -> {
//                if(n.equals(m)) break;
//            })
//        })
        int c = 0;
        for (String m : magazine) {
            for (String n : note) {
                System.out.println(m);
                System.out.println(n);
                if (n.equals(m)) {
                    c++;
                    break;
                }
            }
        }

        String result = c == note.length ? "Yes" : "No";
        System.out.println(result);
    }


}
