package String.TwoPointersApproach;

public class ReverseString {
    static void main(String[] args) {
        // Two pointers
        String input3 = "hello";
        char[] array = input3.toCharArray();
        int left = 0;
        int right = array.length-1;

        while(left < right){
            // Swap
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        String reversedStr = new String(array);
        System.out.println(reversedStr);

        // String builder
        String input2 = "hello";
        String reversed2 = new StringBuilder(input2).reverse().toString();
        System.out.println(reversed2);


        // Manual approach
        String input = "hello";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println(reversed);
    }
}
