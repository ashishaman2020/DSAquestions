package STACKS;

import java.util.Stack;

public class Implement_queue_using_stack {
    private static class queimpl{
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        public queimpl(){

        }
        public void push(int x) {
            while(!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            st1.push(x);
            while(!st2.isEmpty()) {
                st1.push(st2.pop());
            }
        }

        public int pop() {
            return st1.pop();
        }
        public int top(){
            return st1.peek();
        }
    }

    public static void main(String[] args) {
        queimpl q = new queimpl();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.top());
    }
}
