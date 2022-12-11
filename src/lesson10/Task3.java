package lesson10;

public class Task3 {
    public static void exercise(String word) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            newWord += word.charAt(i);
            newWord += word.charAt(i);
        }
        System.out.println(newWord);
    }
}
