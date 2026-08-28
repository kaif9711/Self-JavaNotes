import java.util.Scanner;

public class largest_of_three_numbers{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("A is largest number");
        }
        else if(b>=a && b >= c){
            System.out.println("B is greatest number");
        }
        else{
            System.out.println("C is the greates number");
        }

    }
}
