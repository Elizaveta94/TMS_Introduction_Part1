package lesson6.task2;

public class RAM {
    String name;
    int capacity;

    public RAM(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public RAM() {

    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
