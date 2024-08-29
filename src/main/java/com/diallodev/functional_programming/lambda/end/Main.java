package com.diallodev.functional_programming.lambda.end;

import com.diallodev.functional_programming.lambda.before.Greeting;

public class Main {

    public static void main(String[] args) {
        Greeting helloWordGreeting = () -> System.out.println("Hello Word!");
        helloWordGreeting.printMessage();

        Greeting goodMorningGreeting = () -> System.out.println("Good morning!");
        goodMorningGreeting.printMessage();

        Greeting goodAfternoonGreeting = () -> System.out.println("Good afternoon");
        goodAfternoonGreeting.printMessage();
    }
}
