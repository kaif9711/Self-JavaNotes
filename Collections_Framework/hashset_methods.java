import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashset_methods
{
    public static void main(String[] args)
    {
        HashSet hs = new HashSet();
        hs.add("Kaif");
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.add(null);



        // Constructor types :-
        ArrayList al = new ArrayList();
        al.add("kaif");
        al.add(10);
        al.add(20);
    // HashSet hs1 = new HashSet(); default contructor
    // HashSet hs2 = new HashSet(al); creates an hashet using another collection
    // HashSet<String> hs = new HashSet<>(20); creates hashset using specified capacity

        // Methods of HashSet

        HashSet hs1 = new HashSet();
        hs1.add("Ali");                         // add an element
        System.out.println(hs1.addAll(al));     // add all element so foanother collection
        hs1.remove("kaif");     // remove an object(element)
        System.out.println(hs1.retainAll(al)); // Keeps only the common elements.
        System.out.println(hs1.contains("Kaif")); //Checks whether an element exists.
        System.out.println(hs1.containsAll(al)); //Checks whether all elements of another collection are present.
        System.out.println(hs1.size()); // Returns the number of elements.
        System.out.println(hs.isEmpty()); // Checks whether the HashSet is empty.

        Iterator itr = hs1.iterator();      //Used to traverse the HashSet.

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        Object[] arr = hs1.toArray(); // Converts the HashSet to an array.
        for(int i = 0; i<arr.length; i++) // iterates the elemenst of the object[] array
        {
            System.out.println(arr[i]);
        }
        for(Object obj : arr) // same | // iterates the elemenst of the object[] array
        {
            System.out.println(obj);
        }




    }
}
