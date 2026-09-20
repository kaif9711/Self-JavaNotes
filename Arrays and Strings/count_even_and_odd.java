import java.util.Scanner;

public class count_even_and_odd
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter elements of the array");
        for(int i =0; i<num.length; i++){
             num[i] = sc.nextInt();

        }
        countEvenodd(num);


    }
    public static void countEvenodd(int[] arr){
        int counteven = 0;
        int countodd = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                counteven++;}
            else{
                countodd++;
            }
        }
        System.out.println("Total even numbers are  " + counteven);
        System.out.println("Total odd numbers are " + countodd);
    }


}
