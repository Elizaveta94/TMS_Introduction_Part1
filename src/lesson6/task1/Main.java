package lesson6.task1;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(123, 100);
        CreditCard card2 = new CreditCard(132, 200);
        CreditCard card3 = new CreditCard(321, 300);
        card1.put(300);
        card2.put(1);
        card3.take(150);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }
}
