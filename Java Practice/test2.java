import java.util.ArrayList;
import java.util.List;

public class test2
{
    public static void main(String[] args)
    {
        List<String> name = new ArrayList<>();
        // List<> is interface
        // ArrayList<> is the class that implements list interface
        name.add("kaif");
        name.add("aman");
        name.add("aman");

        System.out.println(name.get(1));
        System.out.println(name.contains("aman"));
        System.out.println(name.size());

        //ArrayList<String>


    }
}
