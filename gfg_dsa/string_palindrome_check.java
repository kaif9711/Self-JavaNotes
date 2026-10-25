public class string_palindrome_check
{
    public static void main(String[] args)
    {
        String s1 = "maam";
        boolean check_palind = palindCheck(s1);

        System.out.print(check_palind);
    }

    static boolean palindCheck(String str1)
    {
        int start = 0;
        int end = str1.length()-1;
        boolean ptr = true;

        while(start<end)
        {
            if(str1.charAt(start) != str1.charAt(end))
            {
                ptr = false;
                break;
            }
            if(str1.charAt(start) == str1.charAt(end))
            {
                ptr = true;
            }

            start++;
            end--;
        }
        return ptr;

    }
}
