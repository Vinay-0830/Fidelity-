import java.util.Scanner;;
public class BankAccountDetailsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account id: ");
        int id = sc.nextInt();
        System.out.print("Enter account type: ");
        String type = sc.next();
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        BankAccountDetails bank = new BankAccountDetails(id, type, balance);
        System.out.println("Enter Amount to be witdraw:");
        double wihdrawamount = sc.nextDouble();
        System.out.println(bank.getdetails());
        if(bank.Withdraw(wihdrawamount)) {
            System.out.println("New Balance: " + bank.getBalance());
        }
        else {
            System.out.println("Insufficient Balance");
        }

    }
}
