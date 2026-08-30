import java.util.Scanner;

public class table_of_number_by_while
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eter the number of which u want the table : ");
        int n = sc.nextInt();
        int i = 1;
        int  count  = 1;
        while(i<11){
            System.out.println(i*n);
            i = i+1;
            System.out.println("count of iteration : " + count);
            count = count + 1;                                          // here count is within the loop so its used to count the iteration

        }
        System.out.println("Total count of iteration is : " + count);   // here count is used outside the loop so it tells total steps/iterations
    }
}
