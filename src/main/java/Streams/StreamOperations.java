package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamOperations {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 0, 6, 433, 0, 4222, 6);

        // Filter Method
        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

        // Map method
        List<Integer> mappedList = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mappedList);

        // Filter and Map mixed
        List<Integer> mixedList = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mixedList);

        // Distinct
        List<Integer> distinctList = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        // Sorting - Ascending
        List<Integer> ascenSorted = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().sorted().collect(Collectors.toList());
        System.out.println(ascenSorted);

        // Sorting - Descending
        List<Integer> descenSorted = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println(descenSorted);

        // Limist Method
        List<Integer> limitedList = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().sorted((a, b) -> b - a).limit(2).collect(Collectors.toList());
        System.out.println(limitedList);

        System.out.println(" ");

        // Max & Min Method
        // min((a, b) -> a - b).get();
        Integer maxInt = Stream.iterate(1, x -> x + 1)
                .limit(10)
                .min((a, b) -> a - b).get();
        System.out.println(maxInt);

        // Parallel Stream
        List<Integer> list2 = Arrays.asList(1,2,3,4);
        list2.parallelStream();
    }
}
