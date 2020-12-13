package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180; //указание значения переменной рост для мужчины;
        double man = Fit.manWeight(height); //вызов метода manWeight с аргументом height;
        System.out.println("Man 180 is " + man); //вывод на консоль результат вычисления;

        height = 170; //переопределение значения переменной рост для женщины;
        double woman = Fit.womanWeight(height); ////вызов метода womanWeight с аргументом height;
        System.out.println("Woman 170 is " + woman); //вывод на консоль результат вычисления;
    }

}