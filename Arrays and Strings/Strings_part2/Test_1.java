package Strings_part2;

import java.io.PrintStream;

public class Test_1
{
    public Test_1(StringBuilder sb)
    {
        System.out.println("Hi");
    }
    public Test_1(char[] ch)
    {
        System.out.println("Hi2");
    }
    public static void main(String[] args)
    {
//        char[] c = {'d', 'e', 'e', 'p', 'a', 'k'};
//        String s = new String(c);
//        System.out.println(s);
//
//        String s1 = "deepak";
//        System.out.println(s1);
//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = "Kaif";
//        System.out.println(s1==s2); //true
//        System.out.println(s1.equals(s2));

        StringBuilder sb = new StringBuilder();
        char[] ch= {'k', 'a', 'i', 'f'};
        String s2 = new String(ch);

        Test_1 s1= new Test_1(sb);

    }
}
