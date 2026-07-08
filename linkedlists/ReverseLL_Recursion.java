// LeetCode #206 - Reverse a linked list.
// Approach : Recursion || Time - O(n) || Space - O(n)
public class ReverseLL_Recursion {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node add(Node head, int data) {
        if (head == null) return new Node(data);
        if (head.next == null) {
            head.next = new Node(data);
            return head;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
        return head;
    }

    public static void print(Node head) {
        if (head == null) return;
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print("Null\n");
    }

    public static Node reverse(Node curr, Node prev, Node next) {
        if (curr == null) return prev;
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        return reverse(curr, prev, next);
    }

    public static Node reverseLL(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        return reverse(curr, prev, next);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head = add(head, 2);
        head = add(head, 3);
        head = add(head, 4);
        head = add(head, 5);
        print(head);
        head = reverseLL(head);
        print(head);
    }
}