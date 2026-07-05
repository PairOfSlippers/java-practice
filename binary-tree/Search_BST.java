// LeetCode #700 - Search in a Binary Search Tree.

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Search_BST {
    static class Node {
        int data;
        Node left, right;

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
            while (i < nodes.length && !q.isEmpty()) {
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

        // Level order traversal using queue size approach.
        static void LevelOrder(Node root) {
            if (root == null) {
                return;
            }
            Deque<Node> q = new ArrayDeque<>();
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

        // Recursion : Time : O(h) || Space : O(h) (Recursion stack)
        static Node Search_Recursion(Node root, int val) {
            if (root == null) {
                return null;
            }
            if (root.data > val) {
                return Search_Recursion(root.left, val);
            } else if (root.data < val) {
                return Search_Recursion(root.right, val);
            } else {
                return root;
            }
        }

        // Iteration : Time : O(h) || Space : O(1)
        static Node Search_Iteration(Node root, int val) {
            while (root != null) {
                if (root.data > val) {
                    root = root.left;
                } else if (root.data < val) {
                    root = root.right;
                } else {
                    return root;
                }
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to be searched: ");
        int val = sc.nextInt();
        System.out.println();
        BinaryTree tree = new BinaryTree();
        int nodes[] = {4, 2, 7, 1, 3};
        Node root = tree.treeBuild(nodes);
        tree.LevelOrder(root);
        System.out.println();
        Node search1 = tree.Search_Recursion(root, val);
        Node search2 = tree.Search_Iteration(root, val);
        if (search1 != null) {
            tree.LevelOrder(search1);
        } else {
            System.out.println("Value not found.");
        }
        System.out.println();
        if (search2 != null) {
            tree.LevelOrder(search2);
        } else {
            System.out.println("Value not found.");
        }
    }
}