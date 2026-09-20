import java.util.Scanner;

public class factorial_while
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of whihc u want ot calculate the factorial");
        int num = sc.nextInt();
        int fact = 1;
        while (num>0){
            fact = fact * num;
            System.out.printf("%d * %d \n", fact, num);

            num--;
        }
        System.out.println(fact);

    }
}
