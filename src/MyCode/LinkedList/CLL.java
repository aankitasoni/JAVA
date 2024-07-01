package MyCode.LinkedList;

public class CLL {

    Node head;
    Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }
    class Node{
        int data;
        Node next;

       Node(int val){
           this.data = val;
       }
    }

    public void insert(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int val){
        Node node = head;
        if (node == null){
            return;
        }
        if (node.data == val){
            head = head.next;
            tail.next = head;
        }
        do{
            Node n = node.next;
            if (n.data == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display(){
        Node node = head;
        if(head != null){
            do {
                System.out.print(node.data + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("Head");
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(15);
        list.insert(2);
        list.insert(3);

        list.delete(15);

        list.display();
    }

}
