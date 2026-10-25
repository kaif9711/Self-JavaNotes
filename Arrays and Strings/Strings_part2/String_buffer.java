package Strings_part2;

public class String_buffer
{

    public static void main(String[] args)
    {
//        //string buffer constructors
//        StringBuffer bf = new StringBuffer();         //string buffer //empty buffer
//        StringBuffer bf1 = new StringBuffer("kaif");              //stringbuffer(String str)
//        StringBuffer bf2 = new StringBuffer(1000);  //stringbuffer(int capacity)
//        System.out.println(bf1.capacity());

//            StringBuffer sb = new StringBuffer();
//            sb.append("kaif java sssssssssssss");
//            System.out.println(sb.capacity());
//            System.out.println(sb.length());
//            System.out.println(sb.delete(4,5 ));


//            StringBuffer sb1 = new StringBuffer("kaif");
//            //StringBuffer sb2 = new StringBuffer("kaif");  // they reffer to different ovjects
//            StringBuffer sb2 = sb1.append("hi");  // here now they both refers to same object
//
//        System.out.println(sb1.equals(sb2));
//            System.out.println(sb1==sb2);
//
//
//
//        String sb3 = new String("kaif");
//            String sb4 = new String("kaif");
//            System.out.println(sb3.equals(sb4));
//        System.out.println(sb3==sb4);

        StringBuffer sb = new StringBuffer("Mayoor school");
        System.out.println(sb.replace(0,6, "dps"));
        System.out.println(sb.insert(10, "Noida"));

        sb.ensureCapacity(100);     // ensure minimum capacity
        sb.trimToSize();            // deletes extra space
        System.out.println(sb.capacity());








    }
}
