package com.diallodev.input_output;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        scanner.nextLine();

        System.out.println("Please enter your occupation: ");
        String occupation = scanner.nextLine();
        System.out.println(occupation);
    }
}
