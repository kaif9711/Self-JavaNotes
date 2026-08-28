import java.util.Scanner;

public class switch_2d_coordinate{

    public static void main(String[] args){

        int x=0;
        int y = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a movement character");
        char value = sc.next().charAt(0);

        switch(value){
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            case 'U':
                y++;
                break;
            case 'D':
                y--;
                break;
            default:
                System.out.println("Invalid character");

        }
        System.out.println("coordinate is " + x + "," + y);


    }

}
