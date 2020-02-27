package warmUp.thursday27.v2;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
public class DoUnique {

    public HashMap<Character, Integer> makeUnique(String origin){

        HashMap<Character, Integer> data = new HashMap<>();

        for(int i=0;i<origin.length();i++){
            char ch = origin.charAt(i);
            if(!data.containsKey(ch)){
                data.put(ch,1);
                //  . PUT FUNCTION PUTS CHARACTER SPECIFIED INTEGER AMOUNT OF TIMES;
            }
            else{
                int count = data.get(ch);
                count+=1;
                data.put(ch,count);
            }
        }

        return data;

    }


}
