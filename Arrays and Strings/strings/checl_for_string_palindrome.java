package strings;

import java.util.Scanner;

public class checl_for_string_palindrome
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        String original = str;
        String reverse = "";

        int ptr = str.length()-1;
        while(ptr>=0){
            reverse = reverse + str.charAt(ptr);
            ptr --;
        }
        System.out.println(reverse);

        if (str.equals(reverse))
        {
            System.out.println("Palindrome");
        }
            else{
                System.out.println("Not palindrome");
            }
        }

    }

