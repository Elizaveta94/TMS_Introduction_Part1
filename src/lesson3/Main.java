package lesson3;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
        System.out.println("_________________________________________________________________________________________");
        Task2();
        System.out.println("_________________________________________________________________________________________");
        Task3();
        System.out.println("_________________________________________________________________________________________");
        Task4();
        System.out.println("_________________________________________________________________________________________");
        Task2_1();
        System.out.println("_________________________________________________________________________________________");
        Task2_2();
        System.out.println("_________________________________________________________________________________________");
        Task2_3();
        System.out.println("_________________________________________________________________________________________");
        Task2_4();
        System.out.println("_________________________________________________________________________________________");
        Task2_5();
        System.out.println("_________________________________________________________________________________________");
        Task2_6();
        System.out.println("_________________________________________________________________________________________");
        Task3_1();
        System.out.println("_________________________________________________________________________________________");
        Task3_2();
        System.out.println("_________________________________________________________________________________________");
        System.out.println("THE END");
    }

    //Task1 Написать программу для вывода названия поры года по номеру месяца.Использовать оператор switch-case.
    public static void Task1() {
        System.out.println("Task number 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        switch (month) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Does not exist");
        }
    }

    //Task2 Написать программу для вывода названия поры года по номеру месяца.Использовать оператор if-else-if.
    public static void Task2() {
        System.out.println("Task number 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else if (month > 12) {
            System.out.println("Does not exist");
        }
    }

    //Task3 Для введенного числа t (температура на улице) вывести если t>-5, вывести "Тепло". Если -5>=t-20,то вывести
    // "Нормально", если -20>=t, то вывести "Холодно".
    public static void Task3() {
        System.out.println("Task number 3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int t = sc.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t > -20) {
            System.out.println("Norm");
        } else {
            System.out.println("Cold");
        }
    }

    //Task4 По введенному номеру определить цвет радуги (1-красный,2-оранжевый,3-желтый, 4 -зеленый, 5- голубой,
    // 6- синий,7 -фиолетовый).
    public static void Task4() {
        System.out.println("Task number 4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("Ligth blue");
            case 6 -> System.out.println("Blue");
            case 7 -> System.out.println("Violet");
            default -> System.out.println("Does not exist");
        }
    }

    //ЦИКЛЫ

    //Task2_1 При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    // При решении используйте операцию инкремента(++).
    public static void Task2_1() {
        System.out.println("Task number 2_1 Cycles");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Task2_2 Необходимо вывести на экран числа от 5 до 1. При решении используйте операцию декремента(--).
    public static void Task2_2() {
        System.out.println("Task number 2_2 Cycles");
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Task2_3 Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного числа.Используйте Scanner.
    public static void Task2_3() {
        System.out.println("Task number 2_3 Cycles");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }

    //Task2_4 Необходимо,чтобы программа выводила последовательность 7 14 21 28 35 ......98. Использовать while.
    public static void Task2_4() {
        System.out.println("Task number 2_4 Cycles");
        int i = 7;
        while (i <= 99) {
            System.out.print(i + " ");
            i += 7;
        }
        System.out.println();
    }

    //Task 2_5 Вывести 10 первых чисел последовательности 0, -5,-10, -15, -20, -25, -30, -35, -40, -45
    public static void Task2_5() {
        System.out.println("Task number 2_5 Cycles");
        int i = 0;
        while (i >= -45) {
            System.out.print(i + " ");
            i -= 5;
        }
        System.out.println();
    }

    //Task 2_6 Вывести на экран квадраты чисел от 10 до 20 включительно.
    public static void Task2_6() {
        System.out.println("Task number 2_6 Cycles");
        for (int i = 10; i <= 20; i++) {
            double sq = Math.pow(i, 2);
            System.out.print(sq + " ");
        }
        System.out.println();
    }

    //Дополнительное задание.
    //Task3_1 Вывести на экран первые 11 членов последовательности Фибоначи.
    public static void Task3_1() {
        System.out.println("Task number 3_1 Bonus");
        int n = 0;
        int n1 = 1;
        int n2;
        System.out.print(n + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n + n1;
            System.out.print(n2 + " ");
            n = n1;
            n1 = n2;
        }
        System.out.println();
    }

    //Task3_2 Напишите программу, которая выводит на консоль таблицу умножения.
    public static void Task3_2() {
        System.out.println("Task number 3_2 Bonus");
        System.out.println("|    | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 |");
        for (int i = 1; i < 11; i++) {
            if (i < 10) {
                System.out.print("| " + i + "  |");
            } else {
                System.out.print("| " + i + " |");
            }
            for (int j = 1; j < 11; j++) {
                int m = i * j;
                if (m < 10) {
                    System.out.print(" " + m + "  |");
                } else {
                    System.out.print(" " + m + " |");
                }
            }
            System.out.println("");
        }
    }
}
