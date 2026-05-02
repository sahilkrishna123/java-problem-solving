package FunctionalProgramming;
import java.util.List;

public class StructureApproach {
    static void main(String[] args) {
        printAllNumbersInList(List.of(3,53,23,77,10,9,5));
        System.out.println();
        printEvenNumbers(List.of(3,53,23,77,10,9,5));
    }
    public static void printAllNumbersInList(List<Integer> numbers){
        // How to loop the numbers
        for(int number : numbers ){
            System.out.println(number);
        }
    }
    public static void printEvenNumbers(List<Integer> numbers){
        for(int number:numbers){
            if(number % 2 ==0){
                System.out.println(number);
            }
        }

    }
}
