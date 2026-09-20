import java.util.Scanner;

public class fibonacci_using_loops
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of terms you want/ or the number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;

        for(int i =1; i<n ; i++){
            System.out.println(a + " ");
            c = a+b;
            a =b;
            b = c;


        }

    }
}
