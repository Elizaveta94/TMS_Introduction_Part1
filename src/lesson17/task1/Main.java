package lesson17.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter IP address: ");
            String ip = scanner.next();
            String ipRegex = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
            if (ip.matches(ipRegex)) {
                System.out.println("IP address is valid");
            } else {
                System.out.println("IP address is invalid");
            }
        }
    }
}
