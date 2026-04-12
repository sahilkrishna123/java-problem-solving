import java.util.*;
public class DuplicateWords {
    public static void main (String[] args){
        String str = "Java is great and Java is powerful language.";

        String[] words = str.toLowerCase().split("\\W+");

        // for (int i=0; i<words.length; i++){
        //     System.out.println(words[i]);
        // }
        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }
            else{
              map.put(word, 1);  
            }
        }
        // for (String word : words) {
        //     map.put(word, map.getOrDefault(word, 0) + 1);
        // }



        // last step to check for duplicates then print out
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
