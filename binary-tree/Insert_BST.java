// LeetCode #701 - Insert into a Binary Search Tree.

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Insert_BST {
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
        static Node treeBuild(int[] nodes) {
            if (nodes[0] == -1 || nodes.length == 0) {
                return null;
            }
            Queue<Node> q = new LinkedList<>();
            Node root = new Node(nodes[0]);
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

        static void LevelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    Node curr = q.remove();
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
                System.out.println();
            }
        }

        // Recursion: Time : O(h) || Space : O(h)
        static Node insert_Recursion(Node root, int data) {
            if (root == null) {
                return new Node(data);
            }
            if (root.data > data) {
                root.left = insert_Recursion(root.left, data);
            } else {
                root.right = insert_Recursion(root.right, data);
            }
            return root;
        }

        // Iteration - Time : O(h) || Space : O(1)
        static Node insert_Iteration(Node root, int data) {
            Node curr = root;
            while (curr != null) {
                if (data < curr.data) {
                    if (curr.left == null) {
                        curr.left = new Node(data);
                        return root;
                    }
                    curr = curr.left;
                } else {
                    if (curr.right == null) {
                        curr.right = new Node(data);
                        return root;
                    }
                    curr = curr.right;
                }
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        System.out.println("Enter value:");
        int data = sc.nextInt();
        int[] nodes = {4, 2, 7, 1, 3};
        Node root = tree.treeBuild(nodes);
        tree.LevelOrder(root);
        System.out.println();
        Node root2 = tree.insert_Recursion(root, data);
        tree.LevelOrder(root2);
        System.out.println();
        Node root3 = tree.insert_Iteration(root, data);
        tree.LevelOrder(root3);
    }
}