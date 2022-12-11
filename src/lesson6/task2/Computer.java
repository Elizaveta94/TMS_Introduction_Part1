package lesson6.task2;

public class Computer {
    int cost;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        ram = new RAM();
        hdd = new HDD();
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
