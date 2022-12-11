package lesson14.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Enter word");
            String word = scanner.next();
            Reverser<String> reverser = (str) -> {
                StringBuilder reversed = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    reversed.insert(0, str.charAt(i));
                }
                System.out.println(reversed);
            };
            reverser.reverse(word);
        }
    }
}
