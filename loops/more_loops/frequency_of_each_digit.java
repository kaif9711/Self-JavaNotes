package more_loops;

import java.util.Scanner;

public class frequency_of_each_digit
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();       // 2342
        int i = 0;
        int count = 0;
        while(num!=0)
        {
            i = num%10;   //2
            if(i==i){
                check(i);
                count++;

            }
            num = num/10;
            //System.out.println(i);

        }
        System.out.println(i+ "occues"+ count+ "times");

    }
    public static boolean check(int n){
        for (int i=0; i<10; i++){
            if (i == n){
                return true;
            }
        }
        return false;
    }
}
