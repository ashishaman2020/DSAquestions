package TREES;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class preorder_traversal_iter {

    private static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    private static class Buildtree{
        static int idx = -1;
        public Node createTree(int[] arr) {
            idx++;
            if(arr[idx] == -1) {
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = createTree(arr);
            newNode.right = createTree(arr);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static List<Integer> preIter(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)return list;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            root = st.pop();
            list.add(root.data);
            if(root.right != null) st.push(root.right);
            if(root.left != null) st.push(root.left);
        }
        return list;
    }

    public static void main(String[] args) {
        preorder_traversal_iter tree = new preorder_traversal_iter();
        Buildtree bt = new Buildtree();
//        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root = bt.createTree(arr);
        System.out.println("Preorder Traversal using recurrsion : ");
        preorder(root);
        System.out.println("\nPreorder Traversal using Iterative approach : ");
        List<Integer> ans = preIter(root);
        for(int i=0;i<ans.size();i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
