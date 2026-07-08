// LeetCode #24 - Swap Nodes in Pairs
// Time : O(n) || Space : O(n)
public class SwapPairs_Recursion {
    static class Node {
        int data;
        Node next;

        Node(int data) {
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

    public static Node swap(Node head) {
        if (head == null || head.next == null) return head;
        Node first = head;
        Node second = head.next;
        first.next = swap(second.next);
        second.next = first;
        return second;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head = add(head, 2);
        head = add(head, 3);
        head = add(head, 4);
        System.out.println("Old list:");
        print(head);
        head = swap(head);
        System.out.println("Swapped list:");
        print(head);
    }
}