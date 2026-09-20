import java.util.Scanner;

public class disctinct_count_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();
        }
    }

    public static int find_distinct(int[] arr, int n){
           int count = 0;
           boolean isdistinct = true;
           for(int i = 0; i<arr.length; i++){     //
               for(int j = (i-1); j>=0; j--){
                   if(arr[i] == arr[j] )
                   {
                       isdistinct = false;
                       break;
                   }
               }
               if(isdistinct == true){
                   count ++;
               }
           }
           return count;
        }




}
