package STACKS.QuestionsOnStacks;

import java.util.Stack;

public class NearestSmallestElement {
    public static void main(String[] args) {
//        int[] arr = {4,5,2,10,8};
        int[] arr = {3,2,1};

        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            while(!st.isEmpty() && st.peek() > arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int i=0;i<res.length;i++) {
            System.out.print(res[i] + " ");
        }
    }
}
