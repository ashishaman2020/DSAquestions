package STACKS;

public class QueueUsingLinkedList {

    private static class Node{
        int data;
        Node next;
        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    private static class queueimpl{
        static Node start;
        static Node end;
        static int size;
        public queueimpl() {
            start = end = null;
            size = 0;
        }

        public static void push(int x) {
            Node temp = new Node(x);
            if(start == null && end == null) {
                start = end = temp;
            }
            else{
                end.next = temp;
            }
            end = temp;
            size = size + 1;
        }

        public static int pop(){
            if(start == null) {
                end = null;
                System.out.println("Queue is empty!");
            }
            Node temp = start;
            start = start.next;
            size = size - 1;
            return temp.data;
        }

        public static int top() {
            if(start == null) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return start.data;
        }

        public static int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        queueimpl qu = new queueimpl();
        qu.push(10);
        qu.push(20);
        qu.push(30);
        qu.push(40);
        System.out.println(qu.size());
        System.out.println(qu.top());
        System.out.println(qu.pop());
        System.out.println(qu.pop());
    }
}
