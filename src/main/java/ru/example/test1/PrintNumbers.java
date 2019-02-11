package ru.example.test1;

/**
 * Написать программу, которая выводит числа от 1 до 100, но вместо чисел кратных 2
 * нужно выводить строку Two, вместо чисел кратных 7 - строку Seven, вместо чисел кратных 2 и 7 - строку TwoSeven
 */
public class PrintNumbers {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String result = "";
            if (i % 2 == 0) {
                result += "Two";
            }
            if (i % 7 == 0) {
                result += "Seven";
            }
            if (result.length() == 0) {
                result += i;
            }
            System.out.println(result);
        }
    }
}
