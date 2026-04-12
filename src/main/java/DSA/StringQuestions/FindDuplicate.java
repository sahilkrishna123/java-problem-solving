import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main (String[] args){
     String str = "helloe";

     findDuplicates(str);


    }
    public static void findDuplicates(String str){
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch: str.toCharArray()){
            if(frequencyMap.containsKey(ch)){
                frequencyMap.put(ch, frequencyMap.get(ch)+1);
            }
            else{
                frequencyMap.put(ch, 1);
            }
        }

        
        // Step 4: Identify and print duplicate characters
        System.out.print("Duplicate characters: ");
        boolean foundDuplicate = false;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                foundDuplicate = true;
            }
        }
        if (!foundDuplicate) {
            System.out.print("None");
        }

    }
}
