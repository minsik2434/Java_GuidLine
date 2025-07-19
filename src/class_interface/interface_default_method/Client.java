package class_interface.interface_default_method;

public class Client {
    public static void main(String[] args) {
        BankAccount a = new SimpleAccount();
        BankAccount b = new SimpleAccount();

        a.deposit(100);
        System.out.println("초기 A 잔액: " + a.getBalance()); // 100
        System.out.println("초기 B 잔액: " + b.getBalance()); // 0

        a.transferTo(b, -50);

        System.out.println("A 잔액: " + a.getBalance()); // 150  ← 불변식 깨짐
        System.out.println("B 잔액: " + b.getBalance()); // -50  ← 불변식 깨짐
    }
}
