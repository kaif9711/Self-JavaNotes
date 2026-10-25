package Strings;

import java.util.HashMap;
import java.util.Map;

public class print_duplicate_chars_in_string
{
    public static void main(String[] args)
    {
        String str = "Prgramming";
        HashMap<Character,Integer> map = new HashMap<>();       // create a Map

        for(int i = 0 ; i<str.length(); i++)        // to iterated through the string
        {
            char ch = str.charAt(i);                // get i as char ch

            map.put(ch, map.getOrDefault(ch, 0) + 1);      // storeing it in the map where ch is the key and occurance is the value
        }
        //System.out.print(map); {P=1, a=1, r=2, g=2, i=1, m=2, n=1}



        for (Map.Entry<Character, Integer> entry : map.entrySet())  // entry interates through each entry(Character, Integer) of the map
        {
            if(entry.getValue() > 1)        // checks value of evrythy entry if greater than 1
            {
                System.out.println(entry.getKey());
            }
        }

    }
}
