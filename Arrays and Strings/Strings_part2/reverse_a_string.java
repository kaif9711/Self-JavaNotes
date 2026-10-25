package Strings_part2;

public class reverse_a_string
{
    public static void main(String[] args)
    {
        String name = "Kaif";
        String reverse = "";    // take an empty string
        for(int i = name.length()-1; i>=0; i--)     // condition i starts from the last character goes till 0 and i-- becuase rever movement
        {
            reverse = reverse + name.charAt(i); // will add each character at i
        }
        System.out.println(reverse);
    }
}
