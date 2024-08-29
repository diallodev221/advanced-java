package com.diallodev.functional_programming.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> fruit = Arrays.asList("apple", "banana", "orange", "pear", "pineapple", "strawberry");
        List<String> capitalizedFruits = processWithStreams(fruit);

        System.out.println(capitalizedFruits);
    }


    static List<String> processWithoutStreams(List<String> fruits) {
        List<String> capitalizeFruits = new ArrayList<>();

        for (String item : fruits) {
            item = item.toUpperCase();
            if (item.startsWith("P")) {
                capitalizeFruits.add(item);
            }
        }
        Collections.sort(capitalizeFruits);
        return capitalizeFruits;
    }

    static List<String> processWithStreams(List<String> fruits) {
        return fruits.stream()
                .map(String::toUpperCase)
                .filter((item) -> item.startsWith("P"))
                .sorted()
                .collect(Collectors.toList());
    }
}
