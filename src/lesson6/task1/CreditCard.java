package lesson6.task1;

public class CreditCard {
    long creditId;
    long currentBalance;

    public CreditCard(long creditId, long currentBalance) {
        this.creditId = creditId;
        this.currentBalance = currentBalance;
    }

    public void put(long value) {
        currentBalance += value;
    }

    public void take(long value) {
        currentBalance -= value;
    }

    @Override
    public String toString() {
        return "CreditId: " + creditId + ". Balance: " + currentBalance;
    }
}
