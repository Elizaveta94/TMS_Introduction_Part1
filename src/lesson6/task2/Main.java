package lesson6.task2;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000, "hp");
        System.out.println(computer1);

        Computer computer2 = new Computer(
                1500,
                "asus",
                new RAM("crucial", 8),
                new HDD("crucial", 1000, "inner")
        );
        System.out.println(computer2);
    }
}
