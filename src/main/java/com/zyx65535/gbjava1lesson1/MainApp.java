package com.zyx65535.gbjava1lesson1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("This is my First1111 App!!!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        String[] myStringArray = {"Orange","Banana","Apple"};
        for (String s : myStringArray) {
            System.out.println(s);
        }
    }

    public static void checkSumSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите операнд А (целочисленное)");
        while (!scanner.hasNextInt()) {
            System.out.println("Ну внимательнее же. Введите операнд А (целочисленное)");
            scanner.next();
            break;
        }
        int operandA =  scanner.nextInt();

        System.out.println("Пожалуйста, введите операнд B (целочисленное)");
        while (!scanner.hasNextInt()) {
            System.out.println("Ну внимательнее же. Введите операнд B (целочисленное)");
            scanner.next();
            break;
        }
        int operandB =  scanner.nextInt();
        if (operandA + operandB > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите номер цвета (целочисленное)");
        while (!scanner.hasNextInt()) {
            System.out.println("Ну внимательнее же. введите номер цвета (целочисленное)");
            scanner.next();
            break;
        }
        int value =  scanner.nextInt();

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите операнд А (целочисленное)");
        while (!scanner.hasNextInt()) {
            System.out.println("Ну внимательнее же. Введите операнд А (целочисленное)");
            scanner.next();
            break;
        }
        int operandA =  scanner.nextInt();

        System.out.println("Пожалуйста, введите операнд B (целочисленное)");
        while (!scanner.hasNextInt()) {
            System.out.println("Ну внимательнее же. Введите операнд B (целочисленное)");
            scanner.next();
            break;
        }
        int operandB =  scanner.nextInt();

        if (operandA >= operandB) {
            System.out.println("a >= b");
        } else System.out.println("a < b");

    }

}
