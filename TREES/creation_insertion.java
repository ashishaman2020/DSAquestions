package TREES;

public class creation_insertion {

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    static class binaryTree{
        static int idx = -1;
        public static Node buildtree(int[] arr) {
            idx++;
            if(arr[idx] == -1) {
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = buildtree(arr);
            newNode.right = buildtree(arr);
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

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        creation_insertion tree = new creation_insertion();
        binaryTree bt = new binaryTree();
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = bt.buildtree(arr);
        System.out.println(root.data);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
}
