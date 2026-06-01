//Delete nth term from the last in a LinkedList. Using sngle pointer.
public class Delete_LL {
    Node head;
    int size;

    Delete_LL() {
        size = 0;
    }

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
        size++;
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
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.print("Null\n");
    }

    public int Size() {
        return size;
    }

    public void delete(int n) {
        if(head==null){
            System.out.println("List is Empty.");
            return;
        }
        if(head.next==null)
            return;
        if(n==this.size){
            head=head.next;
            size--;
            return;
        }
        Node currNode = head;
        Node prev = null;
        for (int i = 0; i < this.size - n - 1; i++) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        size--;
    }

    public static void main(String args[]) {
        Delete_LL list = new Delete_LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.delete(5);
        list.printList();
    }
}