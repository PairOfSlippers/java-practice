import java.util.HashSet;
import java.util.Iterator;
public class HashSets{
    public static void main(String args[]){
        //Creating a HashSet: HashSet<DataType> name=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();

        //Inserting elements in HashSet: name.add(element);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(69);

        //size
        System.out.println("Size of HashSet: "+set.size());

        //To check if element is present in set: name.contains(element);
        if(set.contains(1))
            System.out.println("Element present.");
        if(set.contains(6))
            System.out.println("Element not present.");

        //Deleting an element: name.remove(element);
        set.remove(69);

        //Printing a HashSet: SOPln(name);
        System.out.println(set);

        /*Iterating a HashSet: import java.util.Iterator;
        Iterator nameIT=name.iterator();
        hasNext()- Checks if further elements exists.
        next()- Accesses elements that come next.
         */

        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}