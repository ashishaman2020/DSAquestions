package STACKS;

public class StackUsingLinkedList {

    private static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static class stimpl{
        static Node top;
        static int size;
        public stimpl() {
            top = null;
            size = 0;
        }

        public static void push(int val) {
            Node newnode = new Node(val);
            newnode.next = top;
            top = newnode;
            size = size + 1;
        }

        public static int pop() {
            Node temp = top;
            top = top.next;
            size = size - 1;
            return temp.data;
        }

        public static int size() {
            return size;
        }

        public static int top() {
            return top.data;
        }
    }

    public static void main(String[] args) {
        stimpl st = new stimpl();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.size());
    }
}
