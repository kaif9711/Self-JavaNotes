package Strings_part2;

public class count_no_of_words
{
    public static void main(String[] args)
    {
        String sentence = "My name is Mohammad Kaif";
        int count = 1; // here we are calculating the spaces between the words , so count starting from 1

        for(int i = 0; i<sentence.length(); i++)
        {
            if(sentence.charAt(i) == ' ')  // here we are calculating the spaces between the words ,
            {
                count ++;
            }
        }
        System.out.println("Number of words = " + count);

    }
}
