package com.diallodev.functional_programming;

import com.diallodev.functional_programming.lambda.before.GoodMorningGreeting;
import com.diallodev.functional_programming.lambda.before.Greeting;
import com.diallodev.functional_programming.lambda.before.HelloWordGreeting;

public class Main {

    public static void main(String[] args) {
        HelloWordGreeting helloWordGreeting = new HelloWordGreeting();

        helloWordGreeting.printMessage();

        GoodMorningGreeting goodMorningGreeting = new GoodMorningGreeting();
        goodMorningGreeting.printMessage();

        Greeting goodAfternoonGreeting = () -> System.out.println("Good afternoon");
        goodAfternoonGreeting.printMessage();
    }
}
