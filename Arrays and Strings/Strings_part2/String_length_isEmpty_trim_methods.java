package Strings_part2;
// String Class Methods (length(), isEmpty() & trim()) In Java
public class String_length_isEmpty_trim_methods
{
    public static void main(String[] args)
    {
        String s1 = "kaif";
        String s2 = "MD";
        String s3 = "   Ka if   ";
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        boolean empty = s1.isEmpty();
        System.out.println("*******************************************************************************");
        if(s1.isEmpty())  // empty // empty == true
        {
            System.out.println("Field is empty");
        }
        else
        {
            System.out.println("Field is not empty");
        }
        System.out.println("*******************************************************************************");

        System.out.println("String is empty ? " + empty );
        System.out.println(s3.trim());

        System.out.println(s3.trim().length()); //5
    }
}
