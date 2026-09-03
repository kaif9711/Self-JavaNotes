import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int i=1;
        //first loop for space
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
        //2nd loop for * in each row
            while(k<=2*i-1){
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
    }
}

