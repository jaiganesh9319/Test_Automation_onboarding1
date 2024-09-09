package jai.jai;

public class Application {
    public static void main(String[] args) {
        Account account = new Account(100);
        account.withdraw(20);
        System.out.println("Remaining balance: $" + account.getBalance());
    }
}
