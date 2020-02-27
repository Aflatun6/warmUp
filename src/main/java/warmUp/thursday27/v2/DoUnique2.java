package warmUp.thursday27.v2;
import java.util.HashMap;

public class DoUnique2 {

    public HashMap<Character, Integer> makeUnique(String origin){

        HashMap<Character, Integer> data = new HashMap<>();

        for(int i=0;i<origin.length();i++){
            char ch = origin.charAt(i);
            int count = data.getOrDefault(ch,0);
            data.put(ch,count+1);
            //  . PUT FUNCTION PUTS CHARACTER SPECIFIED INTEGER AMOUNT OF TIMES;
        }


        return data;

    }


}
