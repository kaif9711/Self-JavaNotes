import java.util.Scanner;

public class greatest_among_3_no
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();
//
//        if (a == 0 || b == 0 || c == 0)
//        {
//            System.out.println("Number is zero");
//
//        }---

        if(a > b && a > c){
            System.out.println("Greatest number is " + a);
        }
        else if (b > a && b > c){
            System.out.println("Greatest number is " + b);
        }
        else{
            System.out.println("Greatest number is " + c);
        }

    }

}
