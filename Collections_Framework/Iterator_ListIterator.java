import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_ListIterator
{
    public static void main(String[] args)
    {
        //1: Iterator cursor supprts only : hasNext(), next(), remove()
        List al = new ArrayList();  // created an arraylist object
        al.add("kaif");
        al.add(10);
        al.add("umar");
        al.add(30);
        al.add("zaid");

        //1.1 Using remove() with the cursor by looping
        Iterator itr = al.iterator();   // iterator
//        while(itr.hasNext())
//        {
//            Object value = itr.next();
//            if (value.equals("umar"))
//            {
//                itr.remove();
//            }
//        }
//        System.out.println(al);       //[kaif, 10, 30, zaid]

         //1.2 Using remove() with the cursor using cursor manually
        itr.next();       // kaif
        itr.next();       // 10
        itr.next();      // umar
        itr.remove();
        System.out.println(al);         //[kaif, 10, 30, zaid]

        //2 ListIterator cursor supprts  : hasNext(), next(), remove(),  set(), previous(), hasPrevious()
        ListIterator litr  = al.listIterator(al.size());
        //2.1 Using remove() with the cursor to delete an elemt  moving from backword direction
        while(litr.hasPrevious())
        {
            Object value = litr.previous();
            {
                if(value.equals("umar"))
                {
                    litr.remove();
                }
            }
        }
        System.out.println(al);   //[kaif, 10, 30, zaid]  // umar is removed

        //2.2 Using set() with the cursor to replace an element or object manually moving without loop

        litr.previous(); //zaid
        litr.previous();    //30
        litr.previous(); //umar
        litr.remove(); //removes umar
        System.out.println(al);




    }
}
