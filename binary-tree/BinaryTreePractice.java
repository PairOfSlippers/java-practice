import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;

public class BinaryTreePractice {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        static Node BuildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }

        static void preOrder(Node root) { // Time : O(n)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        static void inOrder(Node root) { // Time : O(n)
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        static void postOrder(Node root) { // Time : O(n)
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        static void levelOrder(Node root) { // Time : O(n)
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        static int countNodes(Node root) { // Time : O(n)
            if (root == null) {
                return 0;
            }
            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);
            return leftNodes + rightNodes + 1;
        }

        static int sumNodes(Node root) { // Time : O(n)
            if (root == null) {
                return 0;
            }
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        static int height(Node root) { // Time : O(n)
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        static int diameter(Node root) { // Time : O(n^2)
            if (root == null) {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;
            return Math.max(diam3, Math.max(diam1, diam2));
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);
        System.out.println("Pre-Order:");
        tree.preOrder(root);
        System.out.println("\nIn-Order:");
        tree.inOrder(root);
        System.out.println("\nPost-Order:");
        tree.postOrder(root);
        System.out.println("\nLevel Order:");
        tree.levelOrder(root);
        System.out.println("No. of nodes: " + tree.countNodes(root));
        System.out.println("Sum of nodes: " + tree.sumNodes(root));
        System.out.println("Height of tree: " + tree.height(root));
        System.out.println("Diameter of tree: " + tree.diameter(root));
    }
}