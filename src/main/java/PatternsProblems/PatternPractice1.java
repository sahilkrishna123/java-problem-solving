package PatternsProblems;

public class PatternPractice1 {
    static void main(String[] args) {
        // Remember these 2 things:
        // 1. no. of rows
        // 2. number of columns in i(th) row
        // 3. what to print?

//        printPattern1(5);
//        printPattern2(4);
        printPattern3(4);
    }
    private static void printPattern1(int n){
//        Pattern for N = 4
//        4444
//        4444
//        4444
//        4444
        for(int i=1; i<=n ; i++){
            for(int j=1; j <= n; j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
    private static void printPattern2(int n){
//        Pattern for N = 4
//        1234
//        1234
//        1234
//        1234
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void printPattern3(int n){
//        Pattern for N = 4
//        1111
//        2222
//        3333
//        4444
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
