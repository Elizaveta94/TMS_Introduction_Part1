package lesson11;

import java.util.Scanner;

public class Task1 {
    public static String exercise1(String documentNumber) {
        return (documentNumber.substring(0, 4) + documentNumber.substring(9, 13));
    }

    public static String exercise2(String documentNumber) {
        String[] a = documentNumber.split("-");
        return documentNumber.replace(a[1], "***").replace(a[3], "***");
    }

    public static String exercise3(String documentNumber) {
        String[] a = documentNumber.toLowerCase().split("-");
        return (a[1] + "/" + a[3] + "/" + a[4].charAt(1) + "/" + a[4].charAt(3));
    }

    public static StringBuilder exercise4(StringBuilder documentNumber) {
        return new StringBuilder("Letters:" + (documentNumber.substring(5, 8).toUpperCase() + "/" + documentNumber.substring(14, 17).toUpperCase() +
                "/" + documentNumber.substring(19, 20).toUpperCase() + "/" + documentNumber.substring(21, 22).toUpperCase()));
    }

    public static void exercise5(String documentNumber) throws DocumentContainException {
        System.out.println("Exercise5:");
        if (documentNumber.contains("ABC") || documentNumber.contains("abc"))
            System.out.println("Contains abc or ABC");
        else {
            throw new DocumentContainException("You entered the wrong document format");
        }
    }

    public static void exercise6(String documentNumber) throws DocumentStartException {
        System.out.println("Exercise6:");
        if (documentNumber.startsWith("555") == true) System.out.println("true");
        else {
            throw new DocumentStartException("You entered the wrong document format");
        }
    }

    public static void exercise7(String documentNumber) throws DocumentEndException {
        System.out.println("Exercise7:");
        if (documentNumber.endsWith("1a2b") == true) System.out.println("true");
        else {
            throw new DocumentEndException("You entered the wrong document format");
        }
    }
}
