public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing $" + amount);
            balance -= amount;
            System.out.println("New balance after withdrawal: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw $" + amount + " (Insufficient balance)");
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Creating multiple threads for withdrawal
        Thread thread1 = new Thread(() -> {
            account.withdraw(500);
        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            account.withdraw(700);
        }, "Thread 2");

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}
