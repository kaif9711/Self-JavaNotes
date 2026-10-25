package Strings_part2;

public class count_char_in_sentence
{
    public static void  main(String[] args)
    {
        String sentence = "Mohammad kaif is a good person";
        int count  = 0;

        for(int i = 0; i<sentence.length(); i++)
        {
            if(sentence.charAt(i) != ' ')  //  means don't count spaces.
            {
                count ++;
            }
        }
        System.out.println("Number of characters = " + count);
    }

}
