package com.teachmeskills.lesson_18.task_2;

import java.util.*;
/*
Task 2
Create an ArrayList class collection with the values of the names of all students in the group
Using Streams:
- Select all names that start with any letter entered from the console (regardless of upper/lower case)
- Sort and return the first element of the collection
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        //- Select all names starting with any letter entered from the console (regardless of upper/lower case)
        List<String> studentName = new ArrayList<> (Arrays.asList("Dmitriy", "Ilya", "Bogdan", "Igor", "Marina", "Daniil", "Sultan", "Georgi", "Kirill", "Kate", "Dmitry", "Rita", "Vlad", "Sergio", "Oleg"));
        Scanner scanner = new Scanner(System.in);
        String firstLetter = scanner.nextLine();
        List <String> filteredNames  = studentName.stream()
                .filter(name -> name.toLowerCase().startsWith(String.valueOf(firstLetter).toLowerCase()))
                .toList();
        System.out.println(filteredNames);
        //- Sort and return the first element of the collection
        String firstSortedName = studentName.stream()
                .sorted()
                .findFirst()
                .orElse("No matches");
        System.out.println(firstSortedName);
    }
}
