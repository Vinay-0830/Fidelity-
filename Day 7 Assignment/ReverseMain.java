import java.util.Scanner;

public class ReverseMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse list = new Reverse();
        System.out.println("Enter the number of elements to be inserted: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element to be inserted: ");
            int element = sc.nextInt();
            list.InsertAtTail(element);
        }
        list.display();
        list.reverse();
        System.out.println("Reversed List: ");
        list.display();
    }
}
