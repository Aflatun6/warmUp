package warmUp.thursday27;

import java.util.*;
import java.util.stream.Stream;

public class HelloWorld {
    public static ArrayList<Character> toList(String hello){
        ArrayList<Character> helloList = new ArrayList<>();
        char[] charList = hello.toCharArray();
        for(int i=0;i<charList.length;i++){
            helloList.add(charList[i]);
        }
        return helloList;
    }
    public static HashSet<Character> toSet(ArrayList<Character> helloList){
        HashSet<Character> setList = new HashSet<>(helloList);
        return setList;
    }
    public static void main(String[] args) {
        String hello = "hello worldd";
        ArrayList<Character> helloList = toList(hello);
        HashSet<Character> setList = toSet(helloList);
//        System.out.println(helloList.toString());
//        System.out.println(setList.toString());
        for(int i=0;i<helloList.size();i++){

        }
    }
}
