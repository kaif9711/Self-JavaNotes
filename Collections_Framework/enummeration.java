import java.util.Enumeration;
import java.util.Vector;

public class enummeration
{
    public static void main(String[] args)
    {
        Vector<String> v = new Vector<>();
        v.add("Kaif");
        v.add("zaid");
        v.add("umar");

        Enumeration e = v.elements();
        while( e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
