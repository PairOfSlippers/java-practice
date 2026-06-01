import java.util.LinkedList;
public class ReverseLL_Iteration{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null) {
            System.out.print(currNode.data + " ");
            currNode=currNode.next;
        }
        System.out.print("NULL");
        System.out.println();

    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        if(head.next==null){
            head.next=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
            currNode=currNode.next;
        currNode.next=newNode;
    }

    public void Iterate(){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        ReverseLL_Iteration list=new ReverseLL_Iteration();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printList();
        list.Iterate();
        list.printList();
    }
}