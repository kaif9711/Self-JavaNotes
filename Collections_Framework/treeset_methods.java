import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class treeset_methods
{
    public static void main(String[] args)
    {
        //Constructors
        TreeSet<Integer> ts = new TreeSet(); //This constructor creates an empty TreeSet.

        ts.add(50);
        ts.add(20);
        ts.add(40);
        ts.add(10);

//        System.out.println(ts);

        TreeSet<Integer> ts1 = new TreeSet<>(Comparator.reverseOrder()); //Comparator constructor, we can give our own sorting rule.
        ts1.add(30);
        ts1.add(60);
        ts1.add(20);
        ts1.add(10);
        ts1.add(50);
//        System.out.println(ts1);


        ArrayList<Integer> al = new ArrayList<>();

        al.add(40);
        al.add(10);
        al.add(30);
        al.add(20);
        TreeSet<Integer> ts2 = new TreeSet<>(al); //This constructor is used to create a TreeSet from another Collection.

        System.out.println(ts);
    }


}
