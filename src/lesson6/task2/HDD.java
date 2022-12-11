package lesson6.task2;

public class HDD {
    String name;
    int capacity;
    String type;

    public HDD(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public HDD() {

    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
