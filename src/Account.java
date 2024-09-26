public class Account {
    private int acc_no;
    private String acc_name;
    private float balance;
    public Account(int acc_no, String acc_name, float balance) {
        this.acc_no = acc_no;
        this.acc_name = acc_name;
        this.balance = balance;
    }
    void Deposit(float amount) {
        balance = balance + amount;
        System.out.println("Successfully Deposited");
        Display();
    }
    void Withdraw(float amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Successfully Withdrawn");
        }
        Display();
    }
    void Check_Balance() {
        System.out.println("Balance fetched successfully");
        Display();

    }
    void Display() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Name: " + acc_name);
        System.out.println("Balance: " + balance);
    }
}

