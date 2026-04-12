package javacore.practice;

public class DuplicateElementsinArray {
    public static void main (String[] args){
        // Duplicate Elements in an array

        int[] array = {1,1,2,3,4,5,5};

//        Step 2: Find and display duplicate elements using nested loops
        System.out.print("Duplicate elements: ");
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    hasDuplicates = true;
                    break;
                }
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println();
        }
    }
}
