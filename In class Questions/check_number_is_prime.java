import java.util.Scanner;

public class check_number_is_prime
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        check_prime(num);
    }
    public static void check_prime(int num){
        int i = 2;
        while(i<num){
            if(num % i== 0){      //7
               System.out.println("not prime ");
                return;
            }
            i++;
        }
        System.out.println(num + " is prime ");
    }
}
