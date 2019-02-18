package ru.example.ippon;

import java.util.regex.Pattern;

public class Class1 {
    private String encodedAlphabet;
    private String decodedAlphabet;

    // Constructor will be called by test methods
    public Class1 (String encodedAlphabet, String decodedAlphabet) {
        this.encodedAlphabet = encodedAlphabet;
        this.decodedAlphabet = decodedAlphabet;
    }

    public String decode(String text) {
        String result = null;
        Pattern p = Pattern.compile("[^a-zA-Z ]");
        if (text != null) {
            if (p.matcher(text).find()) {
                throw new IllegalArgumentException();
            }
            result = "";
            for (int i = 0; i < text.length(); i++) {
                String letter = text.substring(i, i + 1);
                int index = decodedAlphabet.indexOf(letter);
//                System.out.println(letter + " " + index);
                result += encodedAlphabet.substring(index, index + 1);
            }
        }
        return result;
    }

    public String encode(String text) {
        String result = null;
        Pattern p = Pattern.compile("[^a-zA-Z ]");
        if (text != null) {
            if (p.matcher(text).find()) {
                throw new IllegalArgumentException();
            }
            result = "";
            for (int i = 0; i < text.length(); i++) {
                String letter = text.substring(i, i + 1);
                int index = encodedAlphabet.indexOf(letter);
                result += decodedAlphabet.substring(index, index + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String dec = "abcdefghijklmnopqrstuvwxyz";
        String enc = "prjitgcoxbsynwdemhuvlzfqka";
        Class1 class1 = new Class1(enc, dec);
        System.out.println(class1.encode("ippon"));
        System.out.println(class1.decode("xeedw"));
        System.out.println(class1.decode(null));
        System.out.println(class1.decode("bpzp"));
    }
}
