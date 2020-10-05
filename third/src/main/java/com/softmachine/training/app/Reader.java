package com.softmachine.training.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

    /**
     * Read user input to console and return the file path
     *
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