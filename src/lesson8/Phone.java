package lesson8;

public class Phone {

    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling...");
    }

    public void receiveCall(String name, int number) {
        System.out.println(name + ": " + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Sending message to numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

}

