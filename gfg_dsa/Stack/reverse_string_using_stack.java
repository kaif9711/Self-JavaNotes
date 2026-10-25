package Stack;

public class reverse_string_using_stack
{

    public static void main(String[] args)
    {
        String str = "Kaif";

        // initializing a char array
        char[] arr = new char[str.length()];
        // intialzing top with -1 as array will be empty
        int top = -1;

        for(int i = 0; i<str.length(); i++)
        {
            top++;  // increasing the top
            arr[top] = str.charAt(i);   // storing the char of str one by one in the char[] index
        }

        while( top != -1)       // tuns untill top is not empty
        {
            System.out.println(arr[top]);
            top--;  // decreament the top (index)
        }

    }




}
