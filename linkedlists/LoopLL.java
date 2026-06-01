//Detection of loop in LinkedList and remove it.
public class LoopLL {
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

    public boolean Find() {
        if (head == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public void Remove() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                break;
        }
        slow=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        while(fast.next!=slow){
            fast=fast.next;
        }
        fast.next=null;
    }

    public void Assign() {
        Node currNode = head;
        Node prevNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        for (int i = 0; i < 2; i++) {
            prevNode = prevNode.next;
        }
        currNode.next = prevNode;
    }
    /*1->2->3->4->5
     *      ^ - - |
     */

    public static void main(String[] args) {
        LoopLL list = new LoopLL();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.printList();
        list.Assign();
        System.out.println(list.Find());
        if(list.Find())
            list.Remove();
        System.out.println(list.Find());
    }
}