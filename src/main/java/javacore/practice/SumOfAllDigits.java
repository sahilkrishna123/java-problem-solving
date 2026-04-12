package javacore.practice;

public class SumOfAllDigits {
    public static void main(String[] args){
        int num = 345;
        int sum=0;

        while(num!=0){
            sum += num % 10; // get last digit
            num = num / 10;  // remove last digit
        }
        System.out.println(sum);
    }
}
