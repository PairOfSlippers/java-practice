// LeetCode #21 - Merge two sorted lists.
// Time: O(n+m) | Space: O(n)
public class MergeLL_Recursion {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node add(Node head, int data) {
        if (head == null) return new Node(data);
        if (head.next == null) {
            head.next = new Node(data);
            return head;
        }
        Node cur = head.next;
        while (cur.next != null)
            cur = cur.next;
        cur.next = new Node(data);
        return head;
    }

    static void print(Node head) {
        if (head == null) return;
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.print("Null\n");
    }

    static Node merge(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        if (head1.data < head2.data) {
            head1.next = merge(head1.next, head2);
            return head1;
        } else {
            head2.next = merge(head1, head2.next);
            return head2;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1 = add(head1, 2);
        head1 = add(head1, 4);
        print(head1);
        Node head2 = new Node(1);
        head2 = add(head2, 3);
        head2 = add(head2, 4);
        print(head2);
        Node head3 = merge(head1, head2);
        print(head3);
    }
}