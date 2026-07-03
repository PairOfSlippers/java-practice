// LeetCode #235 - Lowest Common Ancestor of a Binary Search Tree.

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class LowestCommonAncestor_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinaryTree {
        static Node treeBuild(int[] nodes) {
            if (nodes[0] == -1 || nodes.length == 0) {
                return null;
            }
            Node root = new Node(nodes[0]);
            Deque<Node> q = new ArrayDeque<>();
            q.add(root);
            int i = 1;
            while (!q.isEmpty() && i < nodes.length) {
                Node curr = q.remove();
                if (i < nodes.length && nodes[i] != -1) {
                    curr.left = new Node(nodes[i]);
                    q.add(curr.left);
                }
                i++;
                if (i < nodes.length && nodes[i] != -1) {
                    curr.right = new Node(nodes[i]);
                    q.add(curr.right);
                }
                i++;
            }
            return root;
        }

        // Recursion: Time : O(h) || Space O(h)
        static Node LCA_Recursion(Node root, Node p, Node q) {
            if (root == null) {
                return null;
            }
            if (root.data > p.data && root.data > q.data) {
                return LCA_Recursion(root.left, p, q);
            } else if (root.data < p.data && root.data < q.data) {
                return LCA_Recursion(root.right, p, q);
            } else {
                return root;
            }
        }

        // Iteration: Time : O(h) || Space : O(1)
        static Node LCA_Iteration(Node root, Node p, Node q) {
            while (root != null) {
                if (root.data > p.data && root.data > q.data) {
                    root = root.left;
                } else if (root.data < p.data && root.data < q.data) {
                    root = root.right;
                } else {
                    return root;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nodes = {6, 2, 8, 0, 4, 7, 9, -1, -1, 3, 5};
        BinaryTree tree = new BinaryTree();
        Node root = tree.treeBuild(nodes);
        Node p = new Node(nodes[1]);
        Node q = new Node(nodes[4]);
        System.out.println("LCA with Recursion: " + tree.LCA_Recursion(root, p, q).data);
        System.out.println("LCA with Iteration: " + tree.LCA_Iteration(root, p, q).data);
    }
}