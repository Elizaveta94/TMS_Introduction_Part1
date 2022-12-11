package lesson11;

public class Main {

    public static void main(String[] args) {
        try {
            Task1.exercise5("4564-drf-45687-rgyd-1d2f");
        } catch (DocumentContainException e) {
            System.out.println(e.getMessage());
        }
        try {
            Task1.exercise6("555-drf-45687-rgyd-1d2f");
        } catch (DocumentStartException e) {
            System.out.println(e.getMessage());
        }
        try {
            Task1.exercise7("555-drf-45687-rgyd-1adr");
        } catch (DocumentEndException e) {
            System.out.println(e.getMessage());
        }
    }
}
