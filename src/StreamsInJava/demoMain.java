package StreamsInJava;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class demoMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2 , 4 , 6 , 8 , 9 , 13);

//        Stream<Integer> data = list.stream();
//
//        Stream<Integer> sortedData = data.sorted();
//        sortedData.forEach(n -> System.out.println(n));

            // These are the basic operation in stream api.
//        Stream<Integer> data = list.stream();
//        Stream<Integer> sortedData = data.sorted();
//        Stream<Integer> oddData = sortedData.filter(n -> n%2==0);
//        Stream<Integer> mappedData = oddData.map(n -> n*4 - 2);
//        mappedData.forEach(System.out::println);
        // All these operation in one line.

        // Lets use the predicate interface used in filter method of stream.
//        Predicate<Integer> predicate = new Predicate<Integer>() { // This is a predicate test function
//            @Override
//            public boolean test(Integer n) {
//                return n % 2 == 0;
//            }
//        };  // This can be done in single line
        Predicate<Integer> predicate = n -> n % 2 == 0 ;

        list.stream()
                .sorted()
                .filter(predicate)//.filter(n -> n%2==0)
                .map(n -> n *4)
                .forEach(System.out::println);


    }
}
