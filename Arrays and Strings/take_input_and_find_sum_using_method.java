import java.util.Scanner;

public class take_input_and_find_sum_using_method
{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int[] num = new int[10];
    System.out.println("Enter the 10 elemets to create an array");
    for(int i=0; i<num.length; i++ ){
        num[i] = sc.nextInt();
    }

    total_sum(num);

}

    public static void total_sum(int[] n){
            int sum = 0;
            for(int i = 0; i<n.length; i++){
                sum = sum+ n[i];
            }
            System.out.println("Sum of array elements is: " + sum);


    }


}
