public class LinkedListP {
    Node head;
    private int size;
    LinkedListP(){
        size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
        public void addFirst(String data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void addLast(String data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=newNode;
                return;
            }
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }
        public void removeFirst(){
            if(head==null){
                System.out.println("List is empty.");
                return;
            }
            size--;
            head=this.head.next;
        }
        public void removeLast(){
            if(head==null){
                System.out.println("List is empty.");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node lastNode=head.next;
            Node currNode=head;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                currNode=currNode.next;
            }
            currNode.next=null;
        }
        public void printList(){
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+" ");
                currNode=currNode.next;
            }
            System.out.print("NULL");
            System.out.println();
        }
        public int getSize(){
            return size;
        }


    public static void main(String[] args) {
        LinkedListP list=new LinkedListP();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.addFirst("This");
        list.printList();
        list.removeFirst();
        list.removeLast();
        list.printList();
    }
}