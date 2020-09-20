package com.softmachine.training;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String filePath = Reader.readConsoleFilePath();
        String text = Reader.readFile(filePath);

        if (text != null) {
            List<String> words = Parser.parse(text);

            if (words != null) {
                Map<String, Long> countedWords = Parser.counter(words);
                Parser.getMaxUsedWords(countedWords);

            } else System.out.println("Your text is empty, try again");
        }
    }


}
