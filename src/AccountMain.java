import java.util.Scanner;
public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account name: ");
        String accountName = sc.next();
        System.out.println("Enter account balance: ");
        float accountBalance = sc.nextFloat();
        System.out.println("Enter the action to be performed :1)Deposit 2)Withdraw 3)Check_Balance");
        int action = sc.nextInt();
        Account account = new Account(accountNumber, accountName, accountBalance);
        switch (action) {
            case 1:
                System.out.println("enter the amount to deposit: ");
                float deposit = sc.nextFloat();
                account.Deposit(deposit);
                break;
                case 2:
                    System.out.println("enter the amount to withdraw: ");
                    float withdraw = sc.nextFloat();
                    account.Withdraw(withdraw);
                    break;
                    case 3:account.Check_Balance();
                    break;
        }
    }
}
