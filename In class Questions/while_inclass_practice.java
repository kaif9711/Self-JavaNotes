//public class Test{
//    public static void main(String[] args) {
//        int i=5;
//        while (i>=0){
//            System.out.println(i);
//            i--;
//        }
//        System.out.println("Blast - off");
//
//
//    }
//
//
//
//}

//// 2. Print even numbers from 2 to 20
//public class Test
//{
//    public static void main(String[] args)
//    {
//        int i = 2;
//
//        while (i <= 20)
//        {
//            i++;
//            if(i%2==0){
//                System.out.println(i + "even");
//            }
//            //            System.out.println(i);
//            //            i = i + 2;
//        }
//    }
//}

//// 3. Find the sum of numbers from 1 to 10
//public class while_inclass_practice
//{
//    public static void main(String[] args)
//    {
//        int i = 1;
//        int sum = 0;
//
//        while (i <= 10)
//        {
//            sum = sum + i;
//            i++;
//        }
//
//        System.out.println("Sum = " + sum);
//    }
//}

//1. Sum of Digits
//
//Question:
//Write a Java program using a while loop to find the sum of all digits of a number.
//
//        Example:
//
//Enter a number: 5832
//
//Sum of digits = 18

//public class while_inclass_practice{
//    public static void main(String[] args){
//        int num =5832;
//        int i =1;
//        int sum = 0;
//        while(num!=0){
//            i =num%10;
//            sum =sum+i;
//            num =num/10;
//
//            System.out.println(i);
//
//        }
//        System.out.println(sum);
//
//    }
//}


//// table of a number
//public class while_inclass_practice{
//    public static void main(String[] args){
//        int n = 2;
//        int i = 1;
//        while(i<=10){
//
//            System.out.println(n + "x" + i + "=" + (n*i));
//            i++;
//
//        }
//
//    }
//
//}
////find palindrome
//public class while_inclass_practice
//{
//    public static void main(String[] args)
//    {
//        int num = 5832;
//        int i = 1;
//        int sum = 0;
//        int reverse = 0;
//        int original = num;
//        while (num != 0)
//        {
//            i = num % 10;
//            reverse = reverse * 10 + i;
//            num = num / 10;
//
//        }
//        System.out.println(reverse);
//        if (original == reverse)
//        {
//            System.out.println("Palindrome");
//        } else
//        {
//            System.out.println("Not a palindome");
//        }
//    }
//}

// count digits
//count digits
public class while_inclass_practice
{
    public static void main(String[] args)
    {
        int num = 5832;
        int i = 1;
        int sum = 0;
        int reverse = 0;
        int original = num;
        int count = 0;
        while (num != 0)
        {
            i = num % 10;
            count++;
//            reverse = reverse * 10 + i;
            num = num / 10;

        }
        System.out.println(count);

    }
}
