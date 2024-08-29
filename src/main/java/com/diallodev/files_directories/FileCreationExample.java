package com.diallodev.files_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreationExample {

    public static void main(String[] args) {

        try {
            // create a new file
            Path path = Paths.get("src/main/java/com/diallodev/files/example.txt");
            if (Files.notExists(path)) {
                Files.createFile(path);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
