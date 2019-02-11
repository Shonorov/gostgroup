package ru.example.test2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FunctionTest {

    @Test
    public void whenZeroesThenOne() {
        Function function = new Function();
        assertThat(function.calculate(0, 0), is(1));
    }

    @Test
    public void whenWrongDataThenMinusOne() {
        Function function = new Function();
        assertThat(function.calculate(1, 2), is(-1));
        assertThat(function.calculate(-2, -1), is(-1));
    }

    @Test
    public void whenCalculateThenSuccess() {
        Function function = new Function();
        assertThat(function.calculate(5, 4), is(5));
        assertThat(function.calculate(6, 6), is(1));
    }
}
