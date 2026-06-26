import java.lang.Math;

public class BinaryTree_Diameter {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        static Node treeBuilder(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = treeBuilder(nodes);
            newNode.right = treeBuilder(nodes);
            return newNode;
        }
    }

    static class TreeInfo {
        int ht, diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }

        static TreeInfo diameter(Node root) { // Time : O(n)
            if (root == null) {
                return new TreeInfo(0, 0);
            }
            TreeInfo left = diameter(root.left);
            TreeInfo right = diameter(root.right);
            int height = Math.max(left.ht, right.ht) + 1;
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;
            int myDiameter = Math.max(diam3, Math.max(diam2, diam1));
            return new TreeInfo(height, myDiameter);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.treeBuilder(nodes);
        System.out.println("Diameter: " + TreeInfo.diameter(root).diam);
    }
}