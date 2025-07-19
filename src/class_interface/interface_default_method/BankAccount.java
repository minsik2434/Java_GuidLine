package class_interface.interface_default_method;

public interface BankAccount {
    int getBalance();

    // amount는 언제나 양수여야한다는 불변식
    void deposit(int amount);
    // amount는 언제나 양수여야 하고, 출금 후에도 잔액은 0 이상이어야 한다
    void withdraw(int amount);

    default void transferTo(BankAccount other, int amount){
        withdraw(amount);
        other.deposit(amount);
    }
}
