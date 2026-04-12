package javacore.practice;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {1,55,3,4,5};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for ( int num: array){
            if(num > largest){
               secondLargest = largest;
               largest = num;
            }
            else if (num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }

    }
    }
