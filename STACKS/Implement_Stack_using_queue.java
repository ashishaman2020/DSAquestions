package STACKS;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_queue {

    private static class stkimpl{
        static Queue<Integer> q = new LinkedList<>();
        public static void push(int x) {
            q.add(x);
            int size = q.size();
            for(int i=0;i<size-1;i++) {
                q.add(q.poll());
            }
        }
        public static int pop(){
            return q.poll();
        }
        public static int top(){
            return q.peek();
        }
        public static int size(){
            return q.size();
        }
    }

    public static void main(String[] args) {
        stkimpl st = new stkimpl();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.size());
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
    }
}
