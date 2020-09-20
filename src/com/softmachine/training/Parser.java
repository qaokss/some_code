package com.softmachine.training;

import java.util.*;
import java.util.stream.Collectors;

public class Parser {

    /**
     * Separate words in the text using separators, count the number of occurrences,
     * sort them alphabetically and print to the console
     * @param text - Any text
     * @return list of words from the text
     */
    public static List<String> parse(String text) {
        List<String> words = Arrays.stream(text.split("[ ,.\"!?;:()+\\-\\[\\]\\n\\r\\t]"))
                .filter(s -> !s.equals(""))
                .map(String::toLowerCase)
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        if (words.size() > 0) {
            System.out.println("All words in file are: "
                    + words.stream().distinct().collect(Collectors.joining(", ")));

            return words;
        }
        return null;
}

    /**
     * Count the number of occurrences of words and display statistics on the screen
     * @param words - List of some words
     * @return Map word - number of occurrences
     */
    public static Map<String, Long> counter(List<String> words) {
        Map<String, Long> countedWords = words.stream()
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

        System.out.println("Statistics of all words used: ");
        countedWords.forEach((word, num)
                -> System.out.println(word + "-" + num));
        return countedWords;
    }

    /**
     * Find the most used words
     * @param countedWords - Map of words with number of their occurrences
     * @return Map of words with maximum occurrences
     */
    public static Map<String, Long> getMaxUsedWords(Map<String, Long> countedWords) {
        long maxValueInMap = (Collections.max(countedWords.values()));
        Map<String, Long> maxUsedWords = new HashMap<>();

//        Map<String, Long> maxUsedWords = countedWords.entrySet().stream()
//                .filter(entry -> entry.getValue().equals(maxValueInMap))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Maximum used words in file are: ");
        countedWords.forEach((key, value) -> {
            if (value.equals(maxValueInMap)) {
                maxUsedWords.put(key, value);
                System.out.println("\"" + key + "\"" + " used " + value + " times");
            }
        });
        return maxUsedWords;
    }
}
