package lesson15.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int size = 100;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(1, 50));
        }
        System.out.println("Removing duplicates");
        numbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Printing even numbers from 7 to 17");
        numbers.stream().filter(n -> n % 2 == 0 && (n > 7 && n < 17)).forEach(System.out::println);
        System.out.println("Multiply by 2");
        numbers = numbers.stream().map(n -> n = n * 2).collect(Collectors.toList());
        System.out.println("Sort and print first 4 numbers");
        numbers.stream().sorted().limit(4).forEach(System.out::println);
        System.out.println("Count items in stream");
        System.out.println(numbers.stream().count());
        System.out.println("Average");
        System.out.println(numbers.stream().mapToInt(n -> n).average().getAsDouble());

    }
}
