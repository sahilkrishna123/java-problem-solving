package DSA.Arrays;

public class Deletion {
    static void main(String[] args) {
        int[] arr = {10,20,100,30,40,50};

        // Delete element at index = 2 i.e 100
        int indexPostion = 2;

        int[] newArr = new int[arr.length-1];

//        for (int i = 0; i < indexPostion; i++){
//            newArr[i] = arr[i];
//        }
//        for (int i = indexPostion; i<newArr.length; i++){
//            newArr[i] = arr[i+1];
//        }
//        for (int e : newArr){
//            System.out.print(e + " ");
//        }

        // or
        int j =0;
        for(int i = 0; i< arr.length; i++){
            if(i==indexPostion){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        for (int e : newArr){
            System.out.print(e + " ");
        }

    }
}
