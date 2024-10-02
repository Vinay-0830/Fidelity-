import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter the operation you want to perform: ");
        System.out.println("1.Insert element at tail\n2.Insert element at head\n3.Insert element at speciic position");
        int op = sc.nextInt();
        if (op == 1) {
            System.out.println("Enter the  number of elements to be insertede: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("enter the element to be inserted: ");
                int element = sc.nextInt();
                list.InsertAtTail(element);
            }
            list.display();
        }
        else if (op == 2) {
            System.out.println("Enter the  number of elements to be inserted: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("enter the element to be inserted: ");
                int element = sc.nextInt();
                list.InsertAtHead(element);
            }
            list.display();
        } else if (op == 3) {
            System.out.println("Input to the list: ");
            System.out.println("Enter the  number of elements to be inserted: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("enter the element to be inserted: ");
                int element = sc.nextInt();
                list.InsertAtTail(element);
            }
            list.display();
            System.out.println("Enter the position where element has to be inserted: ");
            int pos = sc.nextInt();
            System.out.println("Enter the element to be inserted: ");
            int element = sc.nextInt();
            list.InsertAtPos(element,pos);
            list.display();

        }
    }
}
