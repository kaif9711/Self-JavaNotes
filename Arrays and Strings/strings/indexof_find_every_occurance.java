package strings;

//Question

//Write a Java program to find and print the starting positions of every occurrence of a given pattern (substring) in a text.
//
//Requirements:
//
//Create a method:
//
//static void patSearch(String txt, String pat)
//The method should search for all occurrences of pat inside txt.
//Print the starting index of every occurrence.
//If the pattern occurs multiple times, print all positions.
//Overlapping occurrences should also be detected.
//Use String.indexOf() for searching.
//        The main() method should call patSearch().
//Example
//
//Input:
//
//txt = "abababa"
//pat = "aba"
//
//Output:
//
//  0 2 4

import java.util.Scanner;

public class indexof_find_every_occurance
{
    public static void main(String[] ars){
        String txt = "geeksforgeeks";
        String pat = "geeks";

        patsearch(txt, pat);

   }

   static void patsearch(String txt, String pat){
        int pos = txt.indexOf(pat);

        while (pos>=0){
            System.out.println(pos);
            pos = txt.indexOf(pat, pos + 1);
        }
   }
}
