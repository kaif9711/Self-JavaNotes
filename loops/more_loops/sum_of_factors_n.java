import java.util.Scanner;

public class sum_of_factors_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number to check its  sum of factors");
        int num = sc.nextInt();
        int result = factor(num);
    }

    public static int factor(int num){
        int count = 0;
        for ( int i = 1; i<=num ; i++){
            if(num%i==0){
                System.out.println(i);
                count = count + i;
            }


        }
        System.out.println("total sum of factors is  " + count);
        return count;
    }

}
