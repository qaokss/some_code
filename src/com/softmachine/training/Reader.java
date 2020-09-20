package com.softmachine.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    /**
     * Read user input to console and return the file path
     * @return File path from user enter to console
     */
    public static String readConsoleFilePath() {

        String filePath = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //waiting while user enter something similar to file path
        while (filePath == null || filePath.equals("")) {
            System.out.println("Please write full file path to start the program:");
            System.out.println("Example: D:\\Downloads\\new 1.txt   or  .\\\\new 1.txt");

            try {
                filePath = reader.readLine();
            } catch (IOException e) {
                System.out.println("Error while reading input from console");
            }
        }
        return filePath;
    }
}
