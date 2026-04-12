package MethodAndConstructorReference;

import java.util.Arrays;
import java.util.List;

public class BasicClass {
    private static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Sahil", "Krishna", "Moin");

        students.forEach(x -> System.out.println(x));

        students.forEach(BasicClass::print);

    }
}
