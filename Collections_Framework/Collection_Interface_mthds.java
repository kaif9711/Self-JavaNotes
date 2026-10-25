import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Collection_Interface_mthds
{
    // here we are using arraylist without any generics
    // we can use any other Standard class of collection like ArrayList,  Hashset etc

    public static void main(String[] args)
    {
        ArrayList al = new ArrayList(); // this creates an arraylist al object
                                        // with no generics so we can add any type of object(data)

        al.add("kaif");
        al.add("zaid");
        al.add("umar");
        System.out.println(al.add("max")); // boolean add(Object obj) //return true

        System.out.println("--------------------------------------------------------");

        ArrayList al2 = new ArrayList();
        al2.add("123");
        al2.add("123");
        al2.add("456");
        System.out.println(al.addAll(al2)); // boolean addAll(Collection c) // returns true if c is added
        System.out.println(al);             // prints arraylist al  [kaif, zaid, umar, max, 123, 123, 456]

        System.out.println("--------------------------------------------------------");
        System.out.println(al.remove("kaif")); //boolean remove(Object obj) // returns true if obj is removed
        System.out.println(al); //[zaid, umar, max, 123, 123, 456]

        System.out.println("--------------------------------------------------------");
        System.out.println(al.removeAll(al2));  // boolean removeAll(Object obj) // return true of Collection c is revmoved
        System.out.println(al);   // [zaid, umar, max]

        System.out.println("--------------------------------------------------------");
        System.out.println(al.contains("zaid")); // boolean contains(Object obj) // returns true if obj is present
        System.out.println(al);  //  [zaid, umar, max]

        System.out.println("--------------------------------------------------------");

        Iterator itr = al.iterator();  //Creates an Iterator object for the collection.
        while(itr.hasNext())   // checks "Is there another element?"
        {
            System.out.println(itr.next());   // gets the next element.
        }

        System.out.println("--------------------------------------------------------");
        al.clear(); // void clear() //removes all the elements
        System.out.println(al.isEmpty()); // boolean isEmpty() // returns true if arraylist is empty
        System.out.println(al);  // []

    }
}
