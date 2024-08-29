package com.diallodev.functional_programming.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUtils {


    List<String> sorted(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    List<String> beginningWithT(List<String> list) {
        return list.stream()
                .filter(item -> item.startsWith("T"))
                .collect(Collectors.toList());
    }

    List<String> upperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    List<String> everythingCombined(List<String> list){
        return list.stream()
                .sorted()
                .filter(item -> item.startsWith("T"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
