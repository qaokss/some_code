package com.softmachine.training;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Parser {

    public static List<String> parse(String text) {
        //разделяем слова в тексте с помощью разделителей и считаем кол-во вхождений
        List<String> words = Arrays.stream(text.split("[ ,.\"!?;:()\\[\\]\\n\\r\\t]"))
                .filter(s -> !s.equals(""))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        return words;

    }

    public static List<String> sort(List<String> words) {
        //сортируем слова по алфавиту и выводим без повторений
        words.sort(String::compareTo);
        System.out.println("All words in file are: "
                + words.stream().distinct().collect(Collectors.joining(", ")));
        return words;

    }

    public static Map<String, Long> counter(List<String> words) {
        // считаем кол-во вхождений слов и выводим статистику на экран
        Map<String, Long> countedWords = words.stream()
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

        System.out.println("Statistics of all words used: ");
        countedWords.forEach((word, num)
                -> System.out.println(word + "-" + num));
        return countedWords;
    }

    public static Map<String, Long>  getMaxUsedWords(Map<String, Long> countedWords) {
        // находим наиболее используемые слова

        long maxValueInMap = (Collections.max(countedWords.values()));
        Map<String, Long> maxUsedWords = new HashMap<>();

//        Map<String, Long> maxUsedWords = countedWords.entrySet().stream()
//                .filter(entry -> entry.getValue().equals(maxValueInMap))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        System.out.println("Maximum used words in file are: ");
        countedWords.forEach((key, value) -> {
            if (value.equals(maxValueInMap)) {
                maxUsedWords.put(key, value);
                System.out.println("\"" + key +"\""  + " used " + value + " times");
            }
        });
        return maxUsedWords;
    }
}
