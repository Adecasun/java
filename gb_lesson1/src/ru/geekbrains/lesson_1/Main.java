package ru.geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
        byte a = 1;
        short b = 5;
        int c = 50;
        long d = 7865L;
        boolean e = false;
        boolean f = true;
        char g = 'g';
        float t = 7.34f;
        double y = 4.56;
        System.out.println(returnMath(4, 5, 5, 7));
        System.out.println(checkNumber(5, 25));
        name("Вася");
        positiveOrNegative(50);
        checkYear(2020);


    }

    public static double returnMath(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean checkNumber(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void name(String a) {
        System.out.println("Привет, " + a);
    }

    public static void checkYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a %  400 == 0) {
            System.out.println("Год високосный");
        }
       else {
            System.out.println("Год не високосный");
        }

    }
}


