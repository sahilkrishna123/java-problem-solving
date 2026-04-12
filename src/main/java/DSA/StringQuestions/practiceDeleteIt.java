import java.util.*;

public class practiceDeleteIt {
    public static void main (String[] args){
        Map<Character, Integer> map = new HashMap<>();

        map.put('a',1 );
        map.put('b',2 );

        // System.out.println(map.get('b'));
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
