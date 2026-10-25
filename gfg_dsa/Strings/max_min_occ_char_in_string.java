package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class max_min_occ_char_in_string
{
    public static void main(String[] args)
    {
        String str = "banana";
        max_min_occ(str);
    }

    static void max_min_occ(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();   //created a HashMap

        for(int i = 0; i<str.length(); i++)  //this for loop iterates through the string
        {
            char ch = str.charAt(i);    // assign character to char ch

            if(ch != ' ')               // and then check if the character is not a space then add it to the HashMap
            {
            map.put(ch,map.getOrDefault(ch, 0) + 1);      //adding character to the HashMap // getOrDefault(ch, 0) + 1 check if the key present and goves it occ 0
            }                                                        //  if the key reoccure then + 1 // as key cannt be duplicate
        }

        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;
        char maxChar = ' ';
        char minChar = ' ';


        for(Map.Entry<Character, Integer> entry : map.entrySet())       // entry takes one entry<Character, String> of the map
        {
           char c = entry.getKey();         // retrieve the id
           int count = entry.getValue();        // retrieve the value

           if(count>maxCount)
           {
               maxCount = count;
               maxChar = c;
           }

           if(count < minCount)
           {
               minCount = count;
               minChar = c;
           }

        }
        System.out.println("Maximum occurring character: " + maxChar + " = " + maxCount);

        System.out.println("Minimum occurring character: " + minChar + " = " + minCount);




    }
}
