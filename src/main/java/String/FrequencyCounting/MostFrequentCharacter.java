package String.FrequencyCounting;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

//    static void main(String[] args) {
//        // HashMap
//        String str = "leetcode";
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        // Count Frequency
//        for (char ch : str.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        // Find max
//        char maxChar = '\0';
//        int maxCount = 0;
//
//        for(Map.Entry<Character, Integer> entry : map.entrySet()){
//            if(entry.getValue() > maxCount){
//                maxCount = entry.getValue();
//                maxChar = entry.getKey();
//            }
//        }
//        System.out.println("Max character is : " + maxChar + " And its count is: " + maxCount);
//    }

    static void main(String[] args) {
        // Array Implementation - Best for lowercase/ASCII
        String str = "leetcode";

        int[] freq = new int[256];

        // Count frequency
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        char maxChar = '\0';
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxCount) {
                maxChar = ch;
                maxCount = freq[ch];
            }
        }
        System.out.println("Max character is : " + maxChar + " And its count is: " + maxCount);

    }
}
