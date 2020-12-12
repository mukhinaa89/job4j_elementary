package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100)* 1.15;//формула вычисления идеального веса для мужчин;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 115)* 1.15;//формула вычисления идеального веса для женщин;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;//указание значения переменной рост для мужчины;
        double man = Fit.manWeight(height);//вызов метода manWeight с аргументом height;
        System.out.println("Man 187 is " + man);//вывод на консоль результат вычисления;

        height = 170;//переопределение значения переменной рост для женщины;
        double woman = Fit.womanWeight(height);////вызов метода womanWeight с аргументом height;
        System.out.println("Man 170 is " + woman);//вывод на консоль результат вычисления;
    }

}