import java.util.Scanner;

public class ascii_value
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char character = sc.next().charAt(0);

        int ascii = character;

        System.out.println("The ascii value of the Character is " + ascii);

    }
}
