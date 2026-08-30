import java.util.Scanner;

public class table_while_part2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int n = sc.nextInt();
        System.out.println("Enter  the limit : ");
        int m = sc.nextInt();
        int i = 1;

        while(i<=m){
            System.out.println(n*i);
            i = i+1;
        }


    }
}
