package ru.example.test3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CountWordsTest {

    @Test
    public void whenStringThenCountWordReverse() {
        CountWords counter = new CountWords();
        ArrayList<String> expect = new ArrayList<>(Arrays.asList("hello", "world", "me"));
        String input = "Hello world, hello me!";
        assertThat(counter.count(input), is(expect));
    }

}
