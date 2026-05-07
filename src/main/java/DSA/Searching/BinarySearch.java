package DSA.Searching;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        // find element = 60
        int li = 0;
        int hi = arr.length-1;
        int element = 60;
        boolean isFound=false;

        while(li <= hi){
            int mid = (li + hi ) / 2;
            if(arr[mid] == element){
                System.out.println("Element found at: " + mid + " index position");
                isFound=true;
                break;
            }
            if(element > arr[mid]){
                li = mid + 1;
            }
            else{
                hi = mid -1;
            }
        }
        if (!isFound){
            System.out.println("Element not found");
        }

    }
}
