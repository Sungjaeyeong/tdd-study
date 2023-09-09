package money.money;

public class Franc extends Money {
    private String currency;

    public Franc(int amount, String currency) {
        this.amount = amount;
        currency = currency;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier, null);
    }

    String currency() {
        return currency;
    }
}
