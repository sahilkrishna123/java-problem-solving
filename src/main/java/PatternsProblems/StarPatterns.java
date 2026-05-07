package PatternsProblems;

public class StarPatterns {
    static void main(String[] args) {
        // 1. Right angled triangle
//        for(int i=0; i<5; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 2. Inverted Right-Angled Triangle
//        for(int i = 5; i>0; i--){
//            for(int j=i; j>0; j--){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 3. Half Diamond
//        for(int i=0; i<5; i++){
//                for(int j=0; j<=i; j++){
//                    System.out.print(" * ");
//                }
//            System.out.println();
//        }
//        for(int i=3; i>=0;i--){
//            for (int j=i; j>=0; j--){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 4. Mirrored Right Triangle
//        for(int i=1; i<=5; i++){
//            // inner loop for printing spaces
//            for(int j=4; j >= i; j--){
//                System.out.print("  ");
//            }
//
//            // inner loop for printing stars *
//            for(int k  = 1; k <= i; k++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        // 5. Reverse Mirrored Right Triangle
        for(int i=1; i<=5; i++){
            // inner loop for spaces
            for(int j = 1 ; j<i; j++){
                System.out.print("  ");
            }

            // inner loop for stars *
            for(int k = i; k <= 5;k++ ){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
