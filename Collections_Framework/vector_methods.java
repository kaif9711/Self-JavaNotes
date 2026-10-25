import java.util.Vector;

public class vector_methods
{
    public static void main(String[] args)
    {
        Vector v  = new Vector();
        v.add("Kaif");      // this is collection's method
        v.add(1, "zaid");       //this is list method
        v.addElement("umar");       // this is vector's method

        System.out.println(v.firstElement());
    }
}
