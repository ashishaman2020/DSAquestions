package LINKED_LIST.MEDIUM_DLL;

public class CREATION_INSERTION {

    Node head;

    class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CREATION_INSERTION list = new CREATION_INSERTION();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();
    }
}
