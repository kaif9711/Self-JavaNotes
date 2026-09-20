import java.util.Scanner;

public class fibonacci_with_while
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want/ or the number");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int count = 1;
        while(count<=n){                    // while(count<=n) is true inltil its smallen than the n
            int next =first +second;
            first = second;
            second=next;
            count ++;
            System.out.println(first);
        }
    }
}
