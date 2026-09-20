package strings;

import java.util.Scanner;

public class check_for_string_palindrome_part1
{
    public static void main(String[] args){
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean result = palindromecheck(str);
        System.out.println("Plaindorme" + result);
    }

    static boolean palindromecheck(String str1){
        int start = 0;
        int end = str1.length()-1;
        boolean ptr = true;   // take a boolean which is true already we will assume its alrrady palindrome
        while(start<end){                   // // if start(begins from 0) is less than end(begin from length-1)
            if(str1.charAt(start)!=str1.charAt(end)){       // if char at start is  not equal to char at end then ptr = false  and break
                ptr = false;
                break;
            }
            if(str1.charAt(start)==str1.charAt(end)){    // char at start and char at end is equal then ptr == true allthough its already true
                ptr = true;

            }
            start++;    // iterate start and end
            end--;
        }
        return ptr;   // retursn pts either true/false



    }
}
