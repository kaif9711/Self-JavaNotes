//        %%%%%
//        %%%%%
//        %%%%%
//        %%%%%
//        %%%%%
import java.util.Scanner;

public class pattern_part2
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the char u want to print");
        char i = sc.next().charAt(0);

        for(int n=1; n<=5; n++){
            System.out.println();
            for(int m=1; m<=5; m++){
                System.out.print(i);
            }
        }

    }

}
