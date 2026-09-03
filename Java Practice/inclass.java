//import java.util.Scanner;
//
//public class Test{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter time in seconds : ");
//        int second = sc.nextInt();
//        int hr = second/3600;
//        int x = second%3600; //remaining seconds after hours
//        int min = x/60;
//        int sec = x%60;  //remaining seconds after finding minutes
//
//        System.out.printf("Total time is %d : %d : %d", hr, min, sec);
//    }
//
//}
//
//

import java.util.Scanner;

//public class Test{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the age : ");
//        int age = sc.nextInt();
//
//        if(age<=18){
//            System.out.println("Not eligible to vote");}
//            else{;
//                System.out.println("Eligible to vote");
//        }


//public class Test{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int num = sc.nextInt();
//
//        if(num%5==0){
//            System.out.println("Divisible by 5");}
//        else{;
//            System.out.println("Not divisible by 5");
//        }
//    }
//
//
//}

//public class Test
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an alphabet : ");
//        char ch = sc.next().charAt(0);
//
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//        {
//            System.out.println(ch + " is a vowel");
//        } else
//        {
//            System.out.println(ch + " is a consonant");
//        }
//    }

public class inclass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("enter a number");
        int num = sc.nextInt();

        if (num > 0 ){
            System.out.print(" Num is positive ");
            if (num%2==0){
                System.out.println("Number is even");}
                else{
                    System.out.println("Number is odd");
                }
            }
        else if (num<0){
            System.out.print(" Num is negetive ");
            if (num%2==0){
                System.out.println("Number is even");}
            else{
                System.out.println("Number is odd");
            }
        }
        else{
            System.out.print("number is zero");
        }
    }

    }










