import java.util.Map;
import java.util.HashMap;

public class WordOccurenceInString{
    public static void main(String[] args) {
        
        String text = "Java is great and Java is robust programming language";
        String[] words = text.split(" ");
        
        Map<String, Integer> wordsCount = new HashMap<>();

        for(String word: words){
            if(wordsCount.containsKey(word)){
                wordsCount.put(word, wordsCount.get(word)+1);
            }
            else{
                wordsCount.put(word, 1);
            }
        }

        // Print 
        System.out.println("The word occurences are:");
        for(Map.Entry<String, Integer> entry : wordsCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}