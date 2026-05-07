package DSA.Arrays;

public class Insertion {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        for (int e : arr){
            System.out.print(e + " ");
        }
        System.out.println();

        // Insert 100 at index = 2
        int indexPosition = 2;
        int value = 100;

        int[] newArr = new int[arr.length+1];
        for(int i =0; i<indexPosition; i++){
            newArr[i] = arr[i];
        }
        newArr[indexPosition] = value;

        for(int i = indexPosition; i < arr.length; i++){
            newArr[i+1] = arr[i];
        }

        for (int e : newArr){
            System.out.print(e + " ");
        }
    }
}
