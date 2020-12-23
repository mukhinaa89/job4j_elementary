package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first > second && first > third) {
            result = first;
        } else if (first < second && second > third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int res = max(1, 2, 0);
        System.out.println(res);
    }
}