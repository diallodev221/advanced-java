package com.diallodev.functional_programming.method_reference;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // without method reference
        //numbers.forEach((number) -> NumberUtils.evenOrOdd(number));

        // method reference
        numbers.forEach(NumberUtils::evenOrOdd);
    }
}
