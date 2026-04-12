package javacore.practice;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4};

        System.out.println("Are arrays equal? "+ arraysEqual(array1, array2));
    }
    public static boolean arraysEqual(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for(int i =0; i<array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
