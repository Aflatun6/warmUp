package warmUp.thursday27.v2;
import java.util.HashMap;

public class DoUnique3 {

    public HashMap<Character, Integer> makeUnique(String origin){

        HashMap<Character, Integer> data = new HashMap<>();

        for(int i=0;i<origin.length();i++){
            char ch = origin.charAt(i);
//            data.merge(ch, 1, Integer::sum); //SUM IS SUM OF 1 (VALUE) AND THE NUMBER OF 'MERGE' FUNTION WILL GET US CHARACTER;  TO EST' DATA.GET() OR ->>>>>> GETORDEFAULT(CH,SUM OF GET AND 1);
            data.merge(ch,1,(c1,c2)->c1+c2);





        }


        return data;

    }


}
