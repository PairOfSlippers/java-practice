// LeetCode #98 - Validate a Binary Search Tree.
// Time : O(n) || Space : O(h)
import java.util.Deque;
import java.util.ArrayDeque;
public class Validate_BST {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static Node buildTree(int[] nodes){
            if(nodes[0]==-1||nodes.length==0){
                return null;
            }
            Node root = new Node(nodes[0]);
            Deque<Node> q=new ArrayDeque<>();
            q.add(root);
            int i=1;
            while(!q.isEmpty()&&i<nodes.length){
                Node curr=q.remove();
                if(i<nodes.length&&nodes[i]!=-1){
                    curr.left=new Node(nodes[i]);
                    q.add(curr.left);
                }
                i++;
                if(i<nodes.length&&nodes[i]!=-1){
                    curr.right=new Node(nodes[i]);
                    q.add(curr.right);
                }
                i++;
            }
            return root;
        }
        static boolean isValid(Node root,long max,long min){
            if(root==null){
                return true;
            }
            if(root.val>=max||root.val<=min){
                return false;
            }
            return isValid(root.left,root.val,min)&&isValid(root.right,max,root.val);
        }
        static boolean isValidBST(Node root){
            return isValid(root,Long.MAX_VALUE,Long.MIN_VALUE);
        }
        static void LevelOrder(Node root){
            Deque<Node> q=new ArrayDeque<>();
            q.add(root);
            while(!q.isEmpty()){
                int size=q.size();
                for(int i=0;i<size;i++){
                    Node curr=q.remove();
                    System.out.print(curr.val+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        int nodes[]={5,1,6,-1,-1,3,7};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.LevelOrder(root);
        if(tree.isValidBST(root)){
            System.out.println("Valid BST");
        }
        else{
            System.out.println("Not a valid BST");
        }
    }
}