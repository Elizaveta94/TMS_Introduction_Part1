package lesson8;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(234536, "iPhone");
        Phone phone3 = new Phone(567983, "Samsung", 100);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("Pasha");
        phone2.receiveCall("Masha");
        phone3.receiveCall("Dasha");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.receiveCall("Pasha", phone1.getNumber());
        phone2.receiveCall("Masha", phone2.getNumber());
        phone3.receiveCall("Dasha", phone3.getNumber());
        phone1.sendMessage(453334, 455674, 557890);
    }
}
