package String.FrequencyCounting;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    static void main(String[] args) {

        // Hashmap implementation
        String str = "leetcode";

        HashMap<Character, Integer> map = new HashMap<>();
        // Counting frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("Hashmap: first non-repeating character: " + ch);
                break;
            } else {
                System.out.println("Hashmap: No unique character");

            }

        }

        // Array implementation

        String s = "leetcode";

        int[] freq = new int[26];

        // Count frequency
        for (char ch : s.toCharArray()) {
//            freq[ch]++; // Throw Error
            freq[ch - 'a']++;

        }

        // Find first unique
        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                System.out.println("first non-repeating character: " + ch);
                break;
            } else {
                System.out.println("No unique character");
            }

        }
    }
}
