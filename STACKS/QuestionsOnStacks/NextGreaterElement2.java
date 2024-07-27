package STACKS.QuestionsOnStacks;

import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
//        int[] arr = {2,10,12,1,11};
        int[] arr = {1,2,3,4,3};
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--) {
            st.push(arr[i]);
        }

        int[] nextgre = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                nextgre[i] = -1;
            }else {
                nextgre[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int i=0;i<nextgre.length;i++) {
            System.out.print(nextgre[i] + " ");
        }
    }
}
