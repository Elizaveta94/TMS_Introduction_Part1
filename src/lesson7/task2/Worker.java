package lesson7.task2;

public class Worker extends Human implements PrintTitle {
    public Worker(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public void print() {
        System.out.println(name +" " + lastname + ": Worker");
    }
}

