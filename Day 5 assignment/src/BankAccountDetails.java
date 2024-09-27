public class BankAccountDetails {
    private int account_id;
    private String account_type;
    private double balance;
    public BankAccountDetails(int account_id, String account_type, double balance) {
        this.account_id = account_id;
        this.account_type = account_type;
        this.balance = balance;
    }
    public int getAccount_id() {
        return account_id;
    }
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
    public String getAccount_type() {
        return account_type;
    }
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean Withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
    public String getdetails(){
        return "Account ID: "+account_id+"\nAccount Type: "+account_type+"\nBalance: "+balance;
    }
}
