package MyCode.LinkedList;

public class DLL {

    Node head;
//    Node tail;
//    int size;

    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int value){
            this.data = value;
            this.prev = null;
            this.next = null;
        }
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void display(){
        Node newNode = head;
        while(newNode != null){
            System.out.print(newNode.data + " -> ");
            newNode = newNode.next;
        }
        System.out.println("end");
    }

    public void displayReverse(){
        Node node = head;
        Node last = null;
        while (node != null){
            last = node;
            node = node.next;
        }
        while (last != null){
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public void insertLast(int val){
        Node last = head;
        Node newNode = new Node(val);

        if (head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.next = null;
        newNode.prev = last;

    }

    public Node find(int val){
        Node node = head;
        while(node != null){
            if (node.data == val){
                return node;
            }
            node = node.next;
        }
        return node;
    }


    public void insertAfter(int after, int val){
        Node p = find(after);

        if (p == null){
            System.out.println("Doesn't exist");
            return;
        }
        Node newNode = new Node(val);
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if (newNode.next != null){
            newNode.next.prev = newNode;
        }


    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(11);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertLast(99);
        list.insertAfter(99, 55);
        list.display();
//        list.displayReverse();
    }


}
