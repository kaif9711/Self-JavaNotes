//for prime x^2<=n must satisfy
// x * y = n
// x*x <= n
//x * x <= x * y

import java.util.Scanner;

public class prime_check_efficient
{
    public static boolean prime_check(int n){              //boolean because this method will return true /false
        if(n==1){
            return false;
        }
        for (int i=2; i*i<=n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Enter the number to check prime or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is the number prime? Treu/False \n" + prime_check(n));
    }
}
