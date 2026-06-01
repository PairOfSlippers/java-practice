// LeetCode #21 - Merge two sorted lists.
// Time: O(n+m) | Space: O(1)
public class MergeLL {
    Node head1;
    Node head2;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node addLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return head;
    }

    public void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.print("Null\n");
    }

    public Node Merge(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node currNode = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                currNode.next = head1;
                head1 = head1.next;
            } else {
                currNode.next = head2;
                head2 = head2.next;
            }
            currNode = currNode.next;
        }
        if (head1 == null) {
            currNode.next = head2;
        } else {
            currNode.next = head1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeLL list = new MergeLL();
        list.head1 = list.addLast(list.head1, 1);
        list.head1 = list.addLast(list.head1, 2);
        list.head1 = list.addLast(list.head1, 4);
        list.head2 = list.addLast(list.head2, 1);
        list.head2 = list.addLast(list.head2, 3);
        list.head2 = list.addLast(list.head2, 5);
        list.printList(list.head1);
        list.printList(list.head2);
        list.printList(list.Merge(list.head1, list.head2));
    }
}