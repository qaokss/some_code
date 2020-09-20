package com.softmachine.training;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String text = Reader.readFile("D:\\Downloads\\new 1.txt");
        List<String> words = Parser.parse(text);
        List<String> sortedWords = Parser.sort(words);
        Map<String, Long> countedWords = Parser.counter(sortedWords);
        Parser.getMaxUsedWords(countedWords);
    }


}
