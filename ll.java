import LINKED_LIST.MEDIUM_DLL.CREATION_INSERTION;

public class ll {
    Node head;
    class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteFirst(){
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteLast(){
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void main(String[] args) {
        ll list = new ll();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.insertLast(1000);
        list.deleteFirst();
        list.deleteLast();
        list.display();
    }
}
