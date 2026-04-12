package Streams;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class CreatingStreams {
    static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,3,4);
        System.out.println(intList);
        Stream<Integer> listStream = intList.stream();
        System.out.println(listStream);

        Integer[] array = {1,2,3,4,5};
        Stream<Integer> arrayStream = Arrays.stream(array);
        System.out.println(arrayStream);

        Stream<Integer> intStream = Stream.of(1,2,3);
        System.out.println(intStream);

        Stream<Integer> st = Stream.iterate(0, n -> n+1).limit(100);
        System.out.println(st);
    }
}
