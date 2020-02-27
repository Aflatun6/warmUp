package warmUp.thursday27.v1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoUnique {

    public List<Character> getUnique(String origin){
        HashSet<Character> unique_hs = new HashSet<>();
        for(int i=0;i<origin.length();i++){
            unique_hs.add(origin.charAt(i));
        }
        return new ArrayList<>(unique_hs);
    }

    public int countOne(String origin, char letter){
        int count=0;
        for(int i=0;i<origin.length();i++){
            if(origin.charAt(i)==letter){
                count++;
            }
        }
        return count;
    }
    public List<Integer> countAll(String origin,List<Character> unique){
        List<Integer> counts = new ArrayList<>();
        for(Character c : unique){
            int count = countOne(origin,c);
            counts.add(count);
        }
        return counts;
    }
    public MakeUnique makeUnique(String origin){
        List<Character> unique = getUnique(origin);
        List<Integer> counts = countAll(origin,unique);
        return new MakeUnique(unique,counts);
    }


}
