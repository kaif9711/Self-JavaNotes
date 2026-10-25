import java.lang.reflect.Array;
import java.util.ArrayList;


// Wrapper classes are classes that provide an object representation of primitive data types.

//      Primitive	          Wrapper Class
//        byte	                Byte
//        short	                Short
//        int	                Integer
//        long	                Long
//        float	                Float
//        double	            Double
//        char	                Character
//        boolean	            Boolean
public class wrapper_class

//    //Autoboxing//
//    Java automatically converts a primitive into its wrapper object:
//        int a = 10;
//        Integer b = a;
//        This automatic conversion is called autoboxing.

//        //Unboxing//
//        The reverse is also automatic:
//        Integer b = 10;
//        int a = b;
//        This is called unboxing.

{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr); //Java's ArrayList has a built-in toString() method //Java automatically converts the ArrayList into a readable string representation.

        for(int i = 0; i < arr.size(); i++)   //here we cant use arr.lenght, cos Arrlist is a class so we need to use its methods
        {
            System.out.print(arr.get(i));  // similarly to access the elemts we use get()
        }
    }
}
