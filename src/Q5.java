import java.util.Scanner;
public class Q5 {
    public static void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            checkEligibility(age);
            sc.close();
        }

}
