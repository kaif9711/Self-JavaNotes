package Strings;

import java.util.HashSet;

public class remove_duplicates_in_string
{
    public static void main(String[] args)
    {
        String str = " programming";
        String result = " ";

        HashSet <Character> set = new HashSet<>();
        for( int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(set.add(ch)){
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
