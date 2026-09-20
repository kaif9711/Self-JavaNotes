import java.util.Scanner;

public class move_all_zero_to_the_end
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the array one by one : ");
        for (int i = 0; i < n; i++)
        {
            num[i] = sc.nextInt();
        }

        zero_shift(num);
        // Printing the modified array
        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }


    }

    public static void zero_shift(int[] arr){
        int pos = 0;
        for( int i = 0; i<arr.length; i++ ){
            if(arr[i] == 0){
                continue;
            }
            arr[pos] = arr[i];   //
            pos++;
        }
        for(int j = pos; j<arr.length; j++){
            arr[j] = 0;
        }


    }



    // 0 ,1,0 ,13, 19
    //1,13,19,13,19

}
