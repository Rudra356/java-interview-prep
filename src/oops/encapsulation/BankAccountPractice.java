package oops.encapsulation;

public class BankAccountPractice {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "Rudra", 5000);
        b1.deposit(2000);
        System.out.println(b1.getBalance());
        b1.withdraw(-500);
        b1.withdraw(3000);
        b1.withdraw(7000);
        System.out.println(b1.getBalance());

        String details = b1.toString();
        System.out.println(details);
    }
}
