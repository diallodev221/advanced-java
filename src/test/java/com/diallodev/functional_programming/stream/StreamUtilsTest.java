package com.diallodev.functional_programming.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamUtilsTest {

    StreamUtils streamUtils = new StreamUtils();

    private final List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");


    @Test
    void testSorted() {

        List<String> actual = streamUtils.sorted(weekDays);

        List<String> expected = Arrays.asList("Friday", "Monday", "Saturday", "Sunday", "Thursday","Tuesday",  "Wednesday");

        assertEquals(expected, actual);
    }

    @Test
    void testBeginningWithT() {

        List<String> actual = streamUtils.beginningWithT(weekDays);

        List<String> expected = Arrays.asList( "Tuesday","Thursday");

        assertEquals(expected, actual);
    }

    @Test
    void testUpperCase() {

        List<String> actual = streamUtils.upperCase(weekDays);

        List<String> expected = Arrays.asList("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY");

        assertEquals(expected, actual);
    }

    @Test
    void testEverythingCombined() {

        List<String> actual = streamUtils.everythingCombined(weekDays);

        List<String> expected = Arrays.asList("THURSDAY","TUESDAY");

        assertEquals(expected, actual);

    }
}