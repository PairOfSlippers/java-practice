// LeetCode #226 - Invert a binary tree.
import java.util.Queue;
import java.util.LinkedList;

public class InvertBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        static Node TreeBuild(int[] nodes) { // Level Order Build || Time : O(n) || Space : O(h)
            // Here 'h' - height of the tree because of Queue.
            if (nodes[0] == -1 || nodes.length == 0) {
                return null;
            }
            Queue<Node> q = new LinkedList<>();
            Node root = new Node(nodes[0]);
            q.add(root);
            int i = 1;
            while (i < nodes.length && !q.isEmpty()) {
                Node currNode = q.remove();
                if (i < nodes.length && nodes[i] != -1) {
                    currNode.left = new Node(nodes[i]);
                    q.add(currNode.left);
                }
                i++;
                if (nodes[i] != -1 && i < nodes.length) {
                    currNode.right = new Node(nodes[i]);
                    q.add(currNode.right);
                }
                i++;
            }
            return root;
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

        static Node invert(Node root) {
            if (root == null) {
                return null;
            }
            Node leftNode = invert(root.left);
            Node rightNode = invert(root.right);
            root.left = rightNode;
            root.right = leftNode;
            return root;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = tree.TreeBuild(new int[]{4, 2, 7, 1, 3, 6, 9});
        tree.levelOrder(root);
        tree.invert(root);
        tree.levelOrder(root);
    }
}