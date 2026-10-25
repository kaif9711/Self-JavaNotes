package Strings_part2;

public class string_palindrome
{
    public static void main(String[] args)
    {
        String name = "madam";

        String reverse = "";        // taking empty string
        for(int i=name.length()-1; i>=0; i--)   // for loop to revers the string, beginning from the last char till first char
        {
            reverse = reverse + name.charAt(i); // adding the characters(i)
        }

        if(name.equals(reverse)) // equals() method to check two strings
        {
            System.out.println("Palindrome Confirmed!");
        }
        else
        {
            System.out.println("Not a Palidrome");

        }
    }
}
