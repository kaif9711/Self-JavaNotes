package Strings;

public class count_words_in_string
{
    public static void main(String[] args)
    {
        String str = " Javais so easy";

        int count = 0;

        for(int i = 1; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                count++;
            }
        }
        int words = count + 1;
        System.out.print("Number of words in the string is : " + words);
    }
}
