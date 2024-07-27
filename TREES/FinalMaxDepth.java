package TREES;

public class FinalMaxDepth {
    private Node head;
    private static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static class BuildTree{
        static int idx = -1;
        public static Node createTree(int[] arr) {
            idx++;
            if(arr[idx] == -1) {
                return null;
            }
            Node newnode = new Node(arr[idx]);
            newnode.left = createTree(arr);
            newnode.right = createTree(arr);
            return newnode;
        }
    }

    private static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private static int findMaxHeight(Node root) {
        if(root == null) return 0;
        int lh = findMaxHeight(root.left);
        int rh = findMaxHeight(root.right);
        return 1 + Math.max(lh , rh);
    }

    public static void main(String[] args) {
        int arr[] = {2, 10, -1,-1, 20, 4,-1,-1,5,-1,-1};
        BuildTree bt = new BuildTree();
        Node root = bt.createTree(arr);
        System.out.println("Inorder traversal of the tree is : ");
        inorder(root);
        System.out.println("\nThe max depth/ max height of the tree is : ");
        System.out.println(findMaxHeight(root));
    }
}
