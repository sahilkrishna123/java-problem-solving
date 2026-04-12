import java.util.Map;
import java.util.HashMap;

public class DuplicateWordsInString {
    public static void main (String[] args){
        String str = "Java is great and Java is powerful";
        // Convert String to Array of Strings
        String[] input = str.toLowerCase().split("\\W+");

        // Calculate frequencies
        Map<String, Integer> map  = new HashMap<>();

        for(String word: input){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }
            else{
                map.put(word, 1);
            }
        }

        // Print Duplicate words
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }


    }
}
