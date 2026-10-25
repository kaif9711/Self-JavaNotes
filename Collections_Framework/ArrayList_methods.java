import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_methods
{
    public static void main(String[] args)
    {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Kaif");
        al1.add("Aman");
        al1.add("Zaid");
        al1.add("Umar");
        al1.add("Rahul");
        al1.add("Aman");
        al1.add("Sameer");
        al1.add("Ali");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Aman");
        al2.add("Umar");
        al2.add("Danish");
        al2.add("Ali");
        al2.add("Hamza");
        al2.add("Zaid");

        System.out.println(al1.add("ali"));  //  boolean add(0) // return true
        System.out.println(al1.get(1));// E get() // return true Element
        System.out.println((al1.set(1, "Kumar"))); // e set() // Replaces the elemnt at the index
        System.out.println((al1.remove(1))); // boolean remove() // Removes the element at the index
        System.out.println(al2.contains("Hamza")); // boolean contains // return true

        System.out.println(al1.addAll(al2));    // boolean addAll() // return true // add all elements of another collection
        System.out.println(al1);
        System.out.println((al1.removeAll(al2))); // boolean removeAll // return true // remove all the elements of other collection
        System.out.println(al1);

        Iterator itr = al1.iterator();
        while(itr.hasNext())        // return true if there is next element
        {
            System.out.println((itr.next())); // Object next() // return the next element
        }
    }
}
