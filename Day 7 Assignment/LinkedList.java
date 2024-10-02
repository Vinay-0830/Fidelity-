class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    int size;
    LinkedList() {
        head = null;
        size = 0;
    }

    public void InsertAtTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node curr = head;
        while (curr.next!= null) {
            curr = curr.next;
        }
        curr.next = node;
        size++;
    }
    public void InsertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void InsertAtPos(int data, int position) {
        if (position < 0||position > size) {
            System.out.println("Invalid Position");
            return;
        }
        if (position == 0) {
            InsertAtHead(data);
        }
        else if (position == size) {
            InsertAtTail(data);
        }
        else {
            Node curr = head;
            for (int i = 0; i < position - 1; i++) {
                curr = curr.next;
            }
            Node newNode = new Node(data);
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }
    }

    public void display() {
        System.out.println("Elements are: ");
        Node curr = head;
        while (curr!= null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}





