package com.diallodev.files_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoriesExample {

    public static void main(String[] args) {

        try {
            Files.list(Paths.get("."))
                    .filter(file -> !Files.isDirectory(file))
                    .forEach(System.out::println);

            if (Files.notExists(Paths.get("src/main/java/com/diallodev/files_directories/direct"))) {
                Files.createDirectory(Paths.get("src/main/java/com/diallodev/files_directories/direct"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
