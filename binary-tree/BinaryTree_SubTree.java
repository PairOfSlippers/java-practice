// LeetCode #572 - SubTree of Another Tree.
// Time : O(n^2) || Space : O(h)
public class BinaryTree_SubTree {
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

        static boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null)
                return true;
            if (root == null || subroot == null)
                return false;
            if (root.data != subroot.data)
                return false;
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }

        static boolean isSubtree(Node root, Node subroot) {
            if (subroot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.data == subroot.data) {
                if(isIdentical(root, subroot))
                    return true;
            }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        int[] subnodes = {2, 4, -1, -1, 5, -1, -1};
        BinaryTree.idx = -1;
        Node subroot = tree.BuildTree(subnodes);
        System.out.println(tree.isSubtree(root, subroot));
    }
}