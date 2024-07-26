package STACKS.QuestionsOnStacks;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4,12,5,3,1,2,5,3,1,2,4,6};
        int n = arr.length;

        int nextGre[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                nextGre[i] = -1;
            }else{
                nextGre[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int i=0;i<n;i++) {
            System.out.print(nextGre[i] + " ");
        }
    }
}
