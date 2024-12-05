package com.teachmeskills.lesson_18.task_1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
Task 1
Create a collection of the ArrayList class and fill it with random elements of the Integer type.
Using Streams:
- Remove duplicates
- Display all even elements in the range from 7 to 17 (inclusive)
- Multiply each element by 2
- Sort and display the first 4 elements
- Display the number of elements in the stream
- Display the arithmetic mean of all numbers in the stream
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        //Create a collection of the ArrayList class and fill it with random elements of the Integer type.
        List<Integer> list = new Random()
                .ints(4, 10)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);
        //- Remove duplicates
        //- Multiply each element by 2
        list = list.stream()
                .distinct()
                .map(item -> item * 2)
                .collect(Collectors.toList());
        System.out.println(list);
        //- Display all even elements in the range from 7 to 17 (inclusive)
        list = list.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n >= 7 && n <= 17)
                .collect(Collectors.toList());
        System.out.println(list);
        //- Sort and display the first 4 elements
        list = list.stream()
                .limit(4)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);
        //- Display the number of elements in the stream
        int elementsAmount = (int) list.stream()
                .count();
        System.out.println(elementsAmount);
        //- Display the arithmetic mean of all numbers in the stream
        int arithmeticMean  = list.stream()
                .reduce(0, Integer::sum) / 2;
        System.out.println(arithmeticMean);
    }
}
