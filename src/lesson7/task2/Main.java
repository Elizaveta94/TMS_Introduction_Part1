package lesson7.task2;

public class Main {
    public static void main(String[] args) {
        PrintTitle[] array = {new Director("Petr", "Petrov"), new Worker("Ivan", "Ivanov"),
                new Accountant("Vasili", "Vasiliev")};
        for (PrintTitle i : array) {
            i.print();
        }
    }
}
