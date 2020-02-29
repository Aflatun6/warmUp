package warmUp.saturday29;

import java.util.ArrayList;
import java.util.List;

public class SentenceApp {
    public static void main(String[] args) {
        List<String> subjects = list("Noel", "The cat", "The dog");
        List<String> verbs = list("wrote", "chased", "slept on");
        List<String> objects = list("the book", "the ball", "the bed");

        List<String> sentences = allPossible(subjects, verbs, objects);
        sentences.forEach(s-> System.out.println(s));


    }

    private static List<String> list(String noel, String the_cat, String the_dog) {
        List<String> list = new ArrayList<>();
        list.add(noel);
        list.add(the_cat);
        list.add(the_dog);
        return list;
    }

    public static List<String> allPossible(List<String> subjects, List<String> verbs, List<String> objects) {
        StringBuilder print = new StringBuilder();
        List<String> sentences = new ArrayList<>();

        for (String s : subjects) {
            for (String v : verbs) {
                for (String o : objects) {
                    print.append(s + " " + v + " " + o+"\n");
                }
            }
        }
        sentences.add(print.toString());
        return sentences;
    }
}
