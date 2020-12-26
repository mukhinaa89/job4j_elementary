package ru.job4j.condition;

public class MultipleSwitchWeek {
    public int numberOfDay(String name) {
        int value = switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> 0;
        };
        System.out.println(value);
        System.out.println(name);
        return value;
    }

    public static void main(String[] args) {
        MultipleSwitchWeek multipleSwitchWeek = new MultipleSwitchWeek();
        multipleSwitchWeek.numberOfDay("Среда");
        multipleSwitchWeek.numberOfDay("Sunday");
        multipleSwitchWeek.numberOfDay("2");
    }
}