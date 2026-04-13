package String.TwoPointersApproach;

public class Palindrome {
    static void main(String[] args) {
        String str = "madam";

        boolean isPalindrome = true;
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);


//        Approach 2: Ignore Case & Special Characters
//        "A man, a plan, a canal: Panama" → true


//        String str = "A man, a plan, a canal: Panama";
//
//        // Clean the string
//        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
//
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                System.out.println(false);
//                return;
//            }
//            left++;
//            right--;
//        }
//
//        System.out.println(true);
    }
}
