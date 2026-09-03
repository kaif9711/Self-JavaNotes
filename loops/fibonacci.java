import java.util.Scanner;
// 1 1 2 3 5 8 13 .....
public class fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0)
        {
            System.out.print(1);
        } else if (n == 1)
        {
            System.out.print(1 + " ");
            System.out.print(1);
        } else
        { // if user type 2 or greater this else section will run
            System.out.print(1 + " ");
            System.out.print(1 + " ");
            int a = 1;
            int b = 1;
            for (int i = 2; i <= n; i++)
            {
                int c = a + b;
                System.out .print(c + " ");
                a = b;     // a and b values forward
                b=c;
            }

        }

    }

}
