package javacore.practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        System.out.println("H Sahil");

        int[] arr = {1,2,3,4,5};

        // Two pointers approach to reverse an array
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            // swapping
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            // update the counters
            left++;
            right--;
        }


        System.out.println(Arrays.toString(arr));
    }
}
