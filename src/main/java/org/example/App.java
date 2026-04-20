package org.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        StringUtils stringUtils = new StringUtils();

        int sum = calculator.add(2, 3);
        String message = stringUtils.greet("Anton");

        System.out.println("Sum: " + sum);
        System.out.println(message);
    }
}
