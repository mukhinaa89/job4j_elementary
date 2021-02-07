package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        div(-4);
        div(0);
    }

    public static void div(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        } else {
            System.out.println("It's correct");
        }
    }
}