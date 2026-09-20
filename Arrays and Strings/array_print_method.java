import java.util.Scanner;

public class array_print_method
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter the elements for the array");
        for (int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();

        }
        arr_num(num);
    }

        public static void arr_num(int[] n){
            int count = 0;
            for(int i =0; i<n.length; i++){
                count ++;
            System.out.println("elemets of array are " + n[i]);

            }
            System.out.println("Total elemets are " + count);
        }



    }

