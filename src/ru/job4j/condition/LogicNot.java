package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        System.out.println(num % 2 == 0);
        return  num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        LogicNot logicNot = new LogicNot();
        logicNot.isEven(3);
        }

}