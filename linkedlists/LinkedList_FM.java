import java.util.LinkedList;
public class LinkedList_FM{
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("List");
        list.addFirst("This");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}