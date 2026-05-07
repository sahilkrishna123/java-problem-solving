package DSA.Arrays;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        // search element 30 from the given array
        int element = 30;
        boolean isFound = false;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == element){
                System.out.println("Element " + arr[i] + " found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element " + element + " not found");
        }
    }
}
