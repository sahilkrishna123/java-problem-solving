package FunctionalProgramming;

import java.util.List;

public class FunctionalApproach {
    static void main(String[] args) {
        List<Integer> numbers =List.of(3,53,23,77,10,9,5);
//        printAllNumbersInList(numbers);

//        printEvenNumbers(List.of(3,53,23,77,10,9,5));
//        printSquares(numbers);

        List<String> courses = List.of("AWS", "Google Cloud", "Azure", "Spring", "Spring Boot");
//        printCourses(courses);
//        printCoursesContainSpring(courses);
//        printCoursesWith4Length(courses);

        printCharactersFromCourses(courses);
    }
    public static void print(int number){
        System.out.println(number);
    }
    public static void printAllNumbersInList(List<Integer> numbers){
        // What to do?
//        numbers.stream().forEach(FunctionalApproach::print); // Method reference
        // or
//        numbers.stream().forEach(System.out::println);
    }
    public static void printEvenNumbers(List<Integer> numbers){
        // Filter - Only allow even numbers
        numbers
                .stream()
                .filter(number -> number % 2 == 0 )
                .forEach(System.out::println);
    }
    public static void printCourses(List<String> courses){
        courses
                .stream()
                .forEach(System.out::println);
    }
    // Print only those courses which containg Spring
    public static void printCoursesContainSpring(List<String> courses){
        courses
                .stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }
    // Print only those courses whose length > 4
    public static void printCoursesWith4Length(List<String> courses){
        courses
                .stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }
    public static void printSquares(List<Integer> numbers){
        numbers
                .stream()
                .map(number -> number * number)
                .forEach(System.out::println);
    }
    public static void printCharactersFromCourses(List<String> courses){
        courses
                .stream()
//                .map(course -> course.length())
                .map(String::length)
                .forEach(System.out::println);
    }
}
