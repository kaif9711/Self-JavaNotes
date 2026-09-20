import java.util.Scanner;

public class check_if_array_is_sorted_part2
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int  n = sc.nextInt();

        int[] num = new int[n];
        System.out.println(" Enter the elemets");
        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        boolean sorted = issorted(num, n);
        System.out.println("Is array sorted ?" + sorted);

    }

    public static boolean issorted(int[] arr, int n){
        for(int i =1; i<n; i++){
            for (int j = 0; j < i; j++){
                if(arr[i]< arr[j]){     // accending order // If the current element is smaller than any previous element, the array is not sorted.
                    return false;
                }

            }

        }
        return true;

    }




}
