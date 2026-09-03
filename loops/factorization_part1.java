import java.util.Scanner;

public class factorization_part1
{
    public static boolean prime(int n){
            for(int i=2; i<n; i++){
                if(n%i==0){
                    return false;   //
                }
            }
        return true;

    }

    public static void main(String[] args){
        System.out.println("Enter the number to check its factorization ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //50 we will check it by diving it from 2 till 49(n-1)
        for (int i=2; i<n; i++){
            if(prime(i)){
                int x=i;
                while(n%x==0){
                    x=x*i;
                    System.out.println("Prime factor " + i  );
                }

            }

        }




    }
}
