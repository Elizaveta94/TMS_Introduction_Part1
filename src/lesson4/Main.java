package lesson4;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Task0();
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
    }

    //Task0 Создайте массив целых чисел.Напишите программу, которая выводит сообщение о том,
    // входит ли заданное число в массив или нет.  Пусть число для поиска задается с консоли(Scanner).
    public static void Task0() {
        System.out.println("Task0");
        int[] array = new int[]{3, 10, 6, 9, 1, 0, 4, 5,};
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                b = true;
                break;
            }
        }
        if (b == true) {
            System.out.println("Exist");
        } else {
            System.out.println("Does not exist");
        }
        System.out.println("________________________________________________________________");
    }

    //Task1 Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть число задается с консоли
    //(класс Scanner). Если такого числа нет - выведите сообщения об этом. В результате должен быть массив без указанного числа.
    public static void Task1() {
        System.out.println("Task1");
        int[] array = new int[]{25, 10, 6, 9, 1, 56, 4, 6, 1, 56};
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (count > 0) {
                int[] newArray = new int[array.length - count];
                int j = 0;
                for (i = 0; i < array.length; i++) {
                    if (array[i] != n) {
                        newArray[j] = array[i];
                        j++;
                    }
                }
                System.out.println(Arrays.toString(newArray));
            }
        }
        if (count == 0) {
            System.out.println("There is no such number");
        }
        System.out.println("________________________________________________________________");

    }

    //Task2 Создайте и заполните массив случайными числами и выведете макс, мин и среднее значение.Для генерации случайных
    // чисел используйсте метод Math.random(). Пусть будет возможность создавать массив произвольного размера.
    // Пусть размер массива вводится с консоли.
    public static void Task2() {
        System.out.println("Task2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        double average = sum / n;
        System.out.println();
        System.out.println("Average= " + average);
        System.out.println("Max= " + max);
        System.out.println("Min= " + min);
        System.out.println("________________________________________________________________");
    }

    //Task3 Создайте два массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
    //Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массива это значение оказалось
    // больше (либо сообщите, если они равны).
    public static void Task3() {
        System.out.println("Task3");
        int[] array1 = new int[]{31, 4, 5, 4, 10};
        int[] array2 = new int[]{31, 4, 5, 4, 15};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                sum1 = sum1 + array1[i];
                sum2 = sum2 + array2[j];
            }
        }
        double average1 = sum1 / array1.length;
        double average2 = sum2 / array2.length;
        System.out.println("Average1= " + average1);
        System.out.println("Average2= " + average2);
        if (average2 > average1) {
            System.out.println("Average of array 2 is greater");
        } else if (average1 > average2) {
            System.out.println("Average of array 1 is greater");
        } else {
            System.out.println("Averages of array 1 and array 2 is equal");
        }
        System.out.println("________________________________________________________________");
    }

    //Дополнительные задания
    //Task4 Создайте массив из n случайых чисел и выведите его на экран. Размер массива пусть задается с консоли
    // и может быть больше 5 и меньше или равно 10. Если n  не удовлетворяет условию- выведите сообщение об этом.
    //Если пользователь ввел не подходящее число,то программа должна попросить пользователя повторить ввод.
    //Создайте массив только из четных элементов первого массива, если они там есть и вывести его на экран.
    public static void Task4() {
        System.out.println("Task4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n from 5 to 10 inclusive: ");
        int n = sc.nextInt();
        int[] array;
        while (n < 5 || n > 10) {
            System.out.println("Condition does not match");
            System.out.print("Retype n: ");
            n = sc.nextInt();
            array = new int[n];
        }
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        if (count > 0) {
            int[] newArray = new int[count];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0 && array[i] % 2 == 0) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            System.out.println();
            System.out.println(Arrays.toString(newArray));
            System.out.println("________________________________________________________________");
        }
    }

    //Task5 Создайте массив и заполните его. Выведите массив на экран в строку. Замените каждый элемент с нечетным
    // индексом на ноль. Снова выведите массив на экран отельной строкой.
    public static void Task5() {
        System.out.println("Task5");
        int[] array = new int[]{3, 8, 45, 7, 6, 5, 12, 9, 7};
        System.out.print(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println("________________________________________________________________");
    }

    //Task6 Создайте массив строк.Заполните его произвольнми именами людей. Отсортируйте массив. Результат выведите в консоль.
    public static void Task6() {
        System.out.println("Task6");
        String[] array = new String[]{"Sasha", "Masha", "Pasha", "Dasha"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("________________________________________________________________");
    }

    // Реализуйте алгоритм сортировки пузырьком.
    public static void Task7() {
        System.out.println("Task7");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
            System.out.print(array1[i] + " ");
        }
        boolean sort = false;
        int t;
        while (!sort) {
            sort = true;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    t = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = t;
                    sort = false;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array1));
        System.out.println("________________________________________________________________");
        System.out.println("THE END");
    }

}
