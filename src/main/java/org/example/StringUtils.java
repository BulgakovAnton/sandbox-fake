package org.example;

public class StringUtils {

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public String toUpper(String input) {
        return input.toUpperCase();
    }

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }

    public int length(String input) {
        return input.length();
    }

    public String repeat(String input, int times) {
        if (times < 0) {
            throw new IllegalArgumentException("Times cannot be negative");
        }
        return input.repeat(times);
    }
}