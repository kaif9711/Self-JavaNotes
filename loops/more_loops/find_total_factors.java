import java.util.Scanner;

public class find_total_factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number to check its  total factors");
        int num = sc.nextInt();
        int result = factor(num);
    }

    public static int factor(int num){
        int count = 0;
        for ( int i = 1; i<=num ; i++){
            if(num%i==0){
                System.out.println(i);
                count ++;
            }


        }
        System.out.println("total factors are " + count);
        return count;
    }

}
