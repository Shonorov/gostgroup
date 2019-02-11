package ru.example.test3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * На вход программе подается литературный текст. Программа должна вывести список слов,
 * встречающихся в тексте, в котором для каждого слова указывается количество вхождений
 * этого слова в текст, а слова выводятся в порядке убывания частоты вхождения.
 */
public class CountWords {

    public CountWords() {
    }

    public Map<String, Integer> count(String string) {
        string = string.replaceAll("[^a-zA-Z0-9 ]","");
        String[] words = string.toLowerCase().split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                int temp = result.get(word);
                result.put(word, ++temp);
            }
        }
        return result.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
