package MyCode.LinkedList;

public class LL {
    Node head;
    Node tail;
    int size;
    static class Node{
        int data;
        Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }
    }


    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
             tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertBetween(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;

    }

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteBetween(int index){
       if (index == 0){
           deleteFirst();
       }
       if (index == size -1){
           deleteLast();
       }
       Node prev = get(index -1);
       int val = prev.next.data;
       prev.next = prev.next.next;
       return val;
    }

    public Node find(int value){
        Node newNode = head;
        while (newNode != null){
            if (newNode.data == value){
                return newNode;
            }
            newNode = newNode.next;
        }
        return null;
    }

    public Node get(int index){
        Node newNode = head;
        for (int i =0; i < index; i++){
            newNode = newNode.next;
        }
        return newNode;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(13);
        list.insertLast(99);
        list.insertFirst(17);
        list.insertFirst(19);

        list.insertLast(55);
        list.insertBetween(1, 1);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteBetween(3));
        list.display();
//        System.out.println(list.find(17));
//        list.display();
//        System.out.println(list.get(1));
        list.display();

    }
}
