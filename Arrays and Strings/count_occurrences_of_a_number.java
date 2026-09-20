import java.util.Scanner;

public class count_occurrences_of_a_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int n = sc.nextInt();
        int[] num = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();

        }
        System.out.println("Enter the target number");
        int target = sc.nextInt();

        int result = countOccurrences(num, target);
        System.out.println(target + " occured " + result + " times");
    }

        public static int countOccurrences(int[] arr, int target){

            int count = 0;
            for(int i =0; i<arr.length; i++){
                if(arr[i] == target){
                    count++;
                }
            }
            return count;

        }



}
