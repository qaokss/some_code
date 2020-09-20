package com.softmachine.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class Reader {

    /**
     * Read file from user's filesystem
     */
    public static String readFile(String filePath) {

        try {
            return Files.readString(Path.of(filePath));

        } catch (IOException | InvalidPathException e) {
            System.out.println("Error while reading file " + filePath);
            return null;
        }
    }
}
