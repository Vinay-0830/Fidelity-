import org.w3c.dom.Node;

public class Reverse {
    Node head;
    int size;
    Reverse(){
        head = null;
        size = 0;
    }
    public void InsertAtTail(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=node;
        size++;
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void display(){
        System.out.println("Elements are: ");
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr=curr.next;
        }
        System.out.println();
    }
}
