import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class list_vs_set
{
    public static void main(String[] args)
{
    List al = new ArrayList();
    al.add(10);
    al.add(1,20);
    al.add(30);
    al.add(20);
    al.add(null);
    al.add(40);
    al.add(null);

    // Iterator // get elemts in forward direction
    Iterator itr = al.iterator();
    while(itr.hasNext())
    {
        System.out.print(" " + itr.next());
    }
    System.out.println();

    // ListIterator // get elemts in forward direction
    ListIterator litr = al.listIterator(al.size()); // al.listIterator(al.size() starts the iterator at the end of the list:
    while(litr.hasPrevious())  // previous elemnt is prsent
    {
        System.out.print(" " + litr.previous()); // prints
    }

    System.out.println("------------------------");

    Set s = new HashSet();
    s.add(10);
    s.add(20);
    s.add("kaif");
    s.add(null);
    s.add(20);

    // set implements only Iterator not ListIterator
    // Iterator // get elemts in forward direction
    Iterator sitr = s.iterator();
    while(sitr.hasNext())
    {
        System.out.print(" " + sitr.next());
    }

}
}
