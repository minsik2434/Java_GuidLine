package class_interface.interface_default_method;

public class SimpleAccount implements BankAccount{
    private int balance = 0;

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("deposit amount must be positive");
        }
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("withdraw amount must be positive");
        }
        if (balance < amount) {
            throw new IllegalStateException("insufficient funds");
        }
        balance -= amount;
    }
}
