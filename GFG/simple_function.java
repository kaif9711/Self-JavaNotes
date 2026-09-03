import java.util.Scanner;

public class simple_function{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The greater number is " + getmax(a,b));
    }
    public static int getmax(int a, int b){
        if(a>b){
            return a;}
        else{
            return b;
        }


    }

}
