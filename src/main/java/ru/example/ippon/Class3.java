package ru.example.ippon;

import java.util.Stack;
import java.util.regex.Pattern;

public class Class3 {

    public int compute(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = expression.split(" ");
        Pattern num = Pattern.compile("[0-9]");
        Pattern ops = Pattern.compile("[+*/\\-]");
        for (int i = 0; i < arr.length; i++) {
            String letter = arr[i];
            if (num.matcher(letter).find()) {
                stack.push(Integer.parseInt(letter));
            } else if (ops.matcher(letter).find()) {
                switch (letter) {
                    case "*": {
                        stack.push(stack.pop() * stack.pop());
                        break;
                    }
                    case "/": {
                        stack.push(stack.pop() / stack.pop());
                        break;
                    }
                    case "+": {
                        stack.push(stack.pop() + stack.pop());
                        break;
                    }
                    case "-": {
                        stack.push(- stack.pop() + stack.pop());
                        break;
                    }
                }
            }

        }
        return stack.peek();
    }

    public static void main(String[] args) {
        Class3 class3 = new Class3();
        System.out.println(class3.compute("3 6 /"));
    }
}
