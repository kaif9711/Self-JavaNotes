import java.util.Scanner;

public class factorial
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        int i=1;
        while(n>=1){
            //System.out.println("");
            i=i*n;  //5*4*3*2*1
            n--;

            System.out.println(i);
        }

}
}
