package Recursion;

public class Factorial {
    static void main(String[] args) {
//        System.out.println(factorial(5));
//        PrintOneToN(5);
        PrintNToOne(5);
    }
    private static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
    private static void PrintOneToN(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintOneToN(n-1);
        System.out.println(n); // Non Tail Recursion
    }
    private static void PrintNToOne(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintNToOne(n-1);   // Last statement is recursion then its called Tail Recursion
        // Compilers optimize code when its Tail Recursion

    }
}
