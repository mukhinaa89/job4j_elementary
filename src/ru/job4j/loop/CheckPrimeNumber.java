package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            return false;
        } else {
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    return false;
                }
                if (i == number - 1) {
                    return prime;
                }
            }
            return prime;
        }
    }
}