package ru.example.ippon;

import javafx.util.Pair;

import java.util.*;

public class Class2 {

    public static Map<Integer, List<String>> convert(List<Pair<Integer, String>> list) {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Pair<Integer, String> pair : list) {
            if (result.containsKey(pair.getKey())) {
                List<String> temp = result.get(pair.getKey());
                temp.add(pair.getValue());
                result.put(pair.getKey(), temp);
            } else {
                result.put(pair.getKey(), new ArrayList<>(Collections.singletonList(pair.getValue())));
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        Class2 class2 = new Class2();
//        System.out.println(Class2.convert(new));
    }
}
