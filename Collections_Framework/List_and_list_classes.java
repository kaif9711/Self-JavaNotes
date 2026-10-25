import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class List_and_list_classes
{
    public static void main(String[] args)
    {

        // in lists/ lists classes we can specify different types of objects
        // but not recommended
//        List ls = new ArrayList<>();
//        ls.add("kaif");
//        ls.add(12);

        List<String> ls = new ArrayList<>();
        ls.add("Kaif");
        ls.add("Umar");
        ls.add("zaid");
        ls.add("kaif");
        for(int i = 0; i<ls.size(); i++)
        {
            System.out.println(ls.get(i));
        }

        //ArrayList vs LinkedList
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        System.out.println("element at 0'th index " + a.get(0));

        List<Integer> b = new LinkedList<>();
        b.add(111);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        System.out.println("element at 0'th index " + b.get(0));


    }
}
