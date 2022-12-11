package lesson5;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
    }

    //Task1 Создать трехмерный массив из целых чисел.
    //С помощью циклов "пройти" по всему массиву и увеличить каждый
    // элемент на заданное число. Пусть число, на которое будет
    // увеличиваться каждый элемент, задается из консоли.
    private static void Task1() {
        System.out.println("___________________Task1___________________");
        int[][][] array = new int[][][]{{{1, 2, 3, 6}, {6, 20, 12, 7}, {2, 6, 4, 0}}};
        System.out.println(Arrays.deepToString(array));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int s = 0; s < array[i][j].length; s++) {
                    array[i][j][s] += n;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    //Task2  Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
    //Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения B(Black) или W(White).
    //Результат работы программы:
    // W B W B W B W B
    // B W B W B W B W
    // W B W B W B W B
    // B W B W B W B W
    // W B W B W B W B
    // B W B W B W B W
    // W B W B W B W B
    // B W B W B W B W
    private static void Task2() {
        System.out.println("___________________Task2___________________");
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Task3 Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
    private static void Task3() {
        System.out.println("___________________Task3___________________");
        int[][] array = new int[][]{{1, 5, 8, 9}, {2, 7, 0, 1}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum= " + sum);
    }

    //    Создайте двумерный массив целых чисел. Отсортируйте элементы в  строках двумерного массива по возрастанию.
    private static void Task4() {
        System.out.println("___________________Task4___________________");
        int[][] array = new int[][]{{1, 30, 8, 9, 21, 78}, {2, 7, 0, 1, 12, 76, 45}};
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println(Arrays.deepToString(array));
    }
}
