package ru.example.test3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * На вход программе подается литературный текст. Программа должна вывести список слов,
 * встречающихся в тексте, в котором для каждого слова указывается количество вхождений
 * этого слова в текст, а слова выводятся в порядке убывания частоты вхождения.
 */
public class CountWords {

    public CountWords() {
    }

    public List<String> count(String string) {
        String[] words = string.toLowerCase().split("[,;:.!?\\s]+");
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                result.put(word, result.get(word) + 1);
            }
        }
        List sortedList = new ArrayList<>(result.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)).keySet());
        sortedList.forEach(System.out::println);
        return sortedList;
    }
}
