package String.FrequencyCounting;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
    static void main(String[] args) {
        // HashMap
        String str = "leetcode";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        // Print
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println("Character is: " + entry.getKey() + " And its Count is: " + entry.getValue());
        }
    }


//    static void main(String[] args) {
////        Count occurrences of each character
//        // Array Implementation
//        String str = "leetcode";
//
//        int[] freq = new int[256];
//
//        // Count frequency
//        for (char ch : str.toCharArray()) {
//            freq[ch]++;
//        }
//
//        // Print only once per character
//        boolean[] visited = new boolean[256];
//
//        for (char ch : str.toCharArray()) {
//            if (!visited[ch]) {
//                System.out.println("Character '" + ch + "' occurs " + freq[ch] + " times");
//                visited[ch] = true;
//            }
//        }
//    }
}
