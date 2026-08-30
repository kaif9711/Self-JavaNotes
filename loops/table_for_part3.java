import java.util.Scanner;

public class table_for_part3
{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int n = sc.nextInt();
        System.out.println("Enter  the limit : ");
        int m = sc.nextInt();

        for(int i= 1; i<=m; i++){
            System.out.println(n*i);
        }
    }
}
