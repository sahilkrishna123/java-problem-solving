import java.util.Scanner;

public class Java_Practice {
    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama";
        System.out.println(palindrome(testString));
    }
    public static boolean palindrome(String str){
        String cleaned = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left=0;
        int right = cleaned.length() - 1;

        while(left < right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
