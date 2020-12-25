package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first <= second && first >= third) {
            result = second;
        }
        if (third >= first && second <= third) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int res = max(55, 5, 355);
        System.out.println(res);
    }
}