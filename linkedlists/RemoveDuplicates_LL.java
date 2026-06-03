// LeetCode #83 - Remove Duplicates from Sorted List.
// Time: O(n) | Space: O(1)
public class RemoveDuplicates_LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.print("Null\n");
    }

    public void deleteDuplicates() {
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (prev.data == curr.data) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        RemoveDuplicates_LL list = new RemoveDuplicates_LL();
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.printList();
        list.deleteDuplicates();
        list.printList();
    }
}