package strings;

import java.util.Scanner;

public class reverse_of_a_String
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        String reverse = "";

        int ptr = str.length()-1;
        while(ptr>=0){
            reverse = reverse + str.charAt(ptr);
            ptr --;
        }
        System.out.println(reverse);

    }
}
