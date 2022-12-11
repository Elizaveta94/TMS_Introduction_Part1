package lesson15.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = List.of("Roman", "Alexandr", "Maria", "Julia", "Olga", "Iryna", "Yana", "Daniil", "Danila", "Denis", "Valeria",
                "Gleb", "Dmitry", "Olga", "Alexandr", "Svyataslav", "Elizaveta");
        long countOfMyName = names.stream().filter(name -> name.equalsIgnoreCase("Elizaveta")).count();
        System.out.println("Count of my name = " + countOfMyName);
        names.stream().filter(name -> name.toLowerCase().startsWith("a")).forEach(System.out::println);
    }
}
