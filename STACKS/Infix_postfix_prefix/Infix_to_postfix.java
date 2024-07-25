package STACKS.Infix_postfix_prefix;

import java.util.Stack;

public class Infix_to_postfix {

    public static int priority(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String func(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
//        Check weather it is operator or operand
            if((ch>='A' && ch <= 'Z') || (ch>='a' && ch <= 'z') || (ch>=0 && ch<=9)) {
                sb.append(ch);
            }
//            Check if it is a opening paranthesis
            else if(ch == '(') {
                st.push(ch);
            }
            else if(ch == ')') {
                while(!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.peek());
                    st.pop();
                }
                st.pop();
            }
            else {
                while(!st.isEmpty() && (priority(ch) <= priority(st.peek()))) {
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        String res = func(s);
        System.out.println(res);
    }
}
