package warmUp.monday15june;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RansomNote {
    public static void main(String[] args) {
        checkMagazine(new String[]{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"},
                new String[]{"ive", "got", "some", "coconuts"});
    }

    static void checkMagazine(String[] magazine, String[] note) {

//        Arrays.stream(magazine).flatMap(m->{
//            Arrays.stream(note).map(n -> {
//                if(n.equals(m)) break;
//            })
//        })
        List<String> mq = Arrays.stream(magazine).collect(Collectors.toList());
        List<String> nt = Arrays.stream(note).collect(Collectors.toList());
        int c = 0;
        for (String m : mq) {
            for (String n : nt) {
                if (n.equals(m)) {
                    c++;
                    nt.remove(n);
                    break;
                }
            }
        }

        String result = c == note.length ? "Yes" : "No";
        System.out.println(result);
    }


}
