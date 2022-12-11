package lesson7.task2;

public class Accountant extends Human implements PrintTitle {
    public Accountant(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public void print() {
        System.out.println(name +" " + lastname + ": Accountant");
    }
}
