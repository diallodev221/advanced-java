package com.diallodev.input_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/com/diallodev/input_output/example.txt"));
        ) {

            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);

            StringBuilder stringBuilder = new StringBuilder();

            reader.lines().forEach(line -> stringBuilder.append(line + " "));
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
