package DSA.TwoPointersTechnique;

import static java.lang.Long.sum;

public class SumOfTwoNumbers {
    static void main(String[] args) {
        int[] arr = {2,3,5,6,7,9,10,15,20};
        // array should be sorted
        int target = 11;
        int left = 0;
        int right = arr.length-1;
        boolean found=false;

        // two pointers appraoch O(n)
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println("Index positions for "+ target + " are " + left + " " + right);
                right--;
                left++;
                found = true;
            }
            else if(sum > target){
                right --;
            }
            else{
                left ++;
            }
        }
        if(!found){
            System.out.println("Pair not found");
        }
    }
}
