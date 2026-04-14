package String.FrequencyCounting;
import java.util.HashMap;

public class Anagrams {
    static void main(String[] args) {
        // Hashmap
        String s1 = "listen";
        String s2 = "silent";

        if(s1.length() != s2.length()){
            System.out.println(false);
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : s2.toCharArray()){
            if(!map.containsKey(ch)){
                System.out.println("Strings are not anagrams");
                return;
            }
            map.remove(ch);
        }
        if(map.isEmpty()){
            System.out.println("Strings are anagrams");
        }
    }

//    static void main(String[] args) {
//        // Array implementation
//
////        Input:  s1 = "listen", s2 = "silent"
////        Output: true
//        // Array implementation , best for lowercases
//
//        String s1 = "listen";
//        String s2 = "silent";
//
//        if(s1.length() != s2.length()){
//            System.out.println("Strings are not anagrams");
//            return;
//        }
//
//        int[] freq = new int[26];
//
//        // Count frequency for s1 and Subtract count for s2
//        for(int i =0; i <s1.length(); i++){
//            freq[s1.charAt(i) - 'a']++;
//            freq[s2.charAt(i) - 'a']--;
//        }
//
//        // check frequency
//        for(int count : freq){
//            if(count != 0){
//                System.out.println(false);
//                return;
//            }
//        }
//        System.out.println("Both strings are anagrams");
//    }
}
