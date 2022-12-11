package lesson10;

public class Task2 {
    public static void exercise(String text) {
        String[] str = text.trim().split(" ");
        String shortWord = "";
        String longWord = "";
        int a = text.length();
        int b = 0;
        for (String word : str) {
            if (word.length() <= a) {
                a = word.length();
                shortWord = word;
            }
            if (word.length() >= b) {
                b = word.length();
                longWord = word;
            }
        }
        System.out.println("Tha last short word:" + shortWord);
        System.out.println("Tha last long word:" + longWord);
    }
}
