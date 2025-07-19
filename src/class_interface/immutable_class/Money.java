package class_interface.immutable_class;

public final class Money {
    private final int amount;
    private final Currency currency;

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money other){
        if(!this.currency.equals(other.currency)){
            throw new IllegalArgumentException("다른 통화는 덧셈 불가");
        }

        return new Money(this.amount + other.amount, this.currency);
    }
}
