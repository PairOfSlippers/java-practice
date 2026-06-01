import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists{
    public static void main(String[] args){
        //Declaring an ArrayList: ArrayList<Data Type> name=new ArrayList<Data Type>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> list2=new ArrayList<String>();
        ArrayList<Boolean> list3=new ArrayList<Boolean>();

        //Adding elements to an ArrayList: list name.add(Index);
        list.add(0);
        list.add(2);
        list.add(5);

        //Adding elements in between an ArrayList: list name.add(index,element);
        list.add(2,3);

        //Replacing an element: list name.set(index,element);
        list.set(0,1);

        //Deleting an element: listName.remove(index);
        list.remove(1);

        //Size of ArrayList: listName.size();
        int size=list.size();

        //printintg an ArrayList:
        list.add(2,7);
        System.out.print(list+"\n"+size+"\n");

        //To access elements: listName.get(index);
        System.out.println("The 2nd element of the list is: "+list.get(1));

        //Sorting the list: Collections.sort(listName);
        Collections.sort(list);
        System.out.println("Sorted List: "+list);
    }
}