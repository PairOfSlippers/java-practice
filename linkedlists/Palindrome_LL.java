public class Palindrome_LL {
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

    public Node Reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node currNode = head;
        Node prevNode = null;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public Node findMiddle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node start1 = head;
        Node middle = findMiddle();
        Node start2 = Reverse(middle);
        while (start2 != null) {
            if (start1.data != start2.data) {
                return false;
            }
            start1 = start1.next;
            start2 = start2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome_LL list = new Palindrome_LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.printList();
        System.out.println(list.isPalindrome());
    }
}