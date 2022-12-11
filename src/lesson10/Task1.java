package lesson10;

public class Task1 {
    public static String exercise1(String documentNumber) {
        return (documentNumber.substring(0, 3) + documentNumber.substring(9, 13));
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

    public static void exercise5(String documentNumber) {
        if (documentNumber.contains("ABC") || documentNumber.contains("abc")) {
            System.out.println("Contains");
        } else System.out.println("doesn't contain");
    }

    public static boolean exercise6(String documentNumber) {
        return documentNumber.startsWith("555");
    }

    public static boolean exercise7(String documentNumber) {
        return documentNumber.endsWith("1a2b");
    }
}
