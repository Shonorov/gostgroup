package ru.example.test3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CountWordsTest {

    @Test
    public void whenStringThenCountWordReverse() {
        CountWords counter = new CountWords();
        Map<String, Integer> expect = new HashMap<>();
        String input = "Hello world, hello me!";
        expect.put("hello", 2);
        expect.put("world", 1);
        expect.put("me", 1);
        System.out.println(counter.count(input));
        assertThat(counter.count(input), is(expect));
    }

}
