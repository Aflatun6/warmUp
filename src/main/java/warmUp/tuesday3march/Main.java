package warmUp.tuesday3march;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static List<String> list(String... strings) {
        return Arrays.asList(strings);
    }

    private static HashMap<String, List<String>> make(String string) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        List<String> list1= Arrays.asList(string.split(":"));
        List<String> list2 = Arrays.asList(list1.get(1).split(","));

        return hashMap;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/warmUp/tuesday3march", "subj_verb.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        File file2 = new File("./src/main/java/warmUp/tuesday3march", "verb_obj.txt");
        FileReader fr2 = new FileReader(file2);
        BufferedReader br2 = new BufferedReader(fr2);
        String line2 = br2.readLine();
        while (line2 != null) {
            System.out.println(line2);
            line2 = br2.readLine();
        }


    }
}
