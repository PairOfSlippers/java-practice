// LeetCode #112 - Path Sum
// Time : O(n) || Space : O(h)

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class PathSum {
    static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinaryTree {
        static Node buildTree(int[] nodes) {
            if (nodes.length == 0 || nodes[0] == -1) {
                return null;
            }
            Node root = new Node(nodes[0]);
            Queue<Node> q = new LinkedList<>();
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

        static boolean path(Node root, int sum) {
            if (root == null) {
                return false;
            }
            sum -= root.data;
            if (sum == 0 && root.left == null && root.right == null) {
                return true;
            }
            return path(root.left, sum) || path(root.right, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target sum:");
        int sum = sc.nextInt();
        BinaryTree tree = new BinaryTree();
        int[] nodes = {5, 4, 8, 11, -1, 13, 4, 7, 2, -1, -1, -1, 1};
        Node root = tree.buildTree(nodes);
        System.out.println("Result is: " + tree.path(root, sum));
    }
}