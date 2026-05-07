package DSA.Sorting;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {6,1,2,3,4,5};
        int length = arr.length;
        // Bubble sort algorithm
        for(int i=1; i < length; i++){
            boolean swapped = false;
            for(int j=0; j < length - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            if (swapped==false){
                break;
            }
        }
        // print sorted array
        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
