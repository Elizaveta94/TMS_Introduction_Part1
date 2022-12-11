package lesson7.task2;

public class Director extends Human implements PrintTitle {


    public Director(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public void print() {
        System.out.println(name + " " + lastname + ": Director");
    }
}
