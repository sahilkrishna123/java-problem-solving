package String.TwoPointersApproach;

public class ReverseWords {
    static void main(String[] args) {
        String s = "  the sky is blue  ";

        char[] arr = s.trim().toCharArray();

        // Step 1: Reverse whole string
        reverse(arr, 0, arr.length - 1);

        int start = 0;

        // Step 2: Reverse each word
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        // Step 3: Clean extra spaces
        String result = cleanSpaces(arr);
        System.out.println(result);
    }

    // Helper to reverse characters
    static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Helper to remove extra spaces
    static String cleanSpaces(char[] arr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < arr.length) {
            while (i < arr.length && arr[i] == ' ') i++; // skip spaces

            while (i < arr.length && arr[i] != ' ') {
                sb.append(arr[i]);
                i++;
            }

            while (i < arr.length && arr[i] == ' ') i++; // skip spaces

            if (i < arr.length) sb.append(" ");
        }

        return sb.toString();
    }
}
