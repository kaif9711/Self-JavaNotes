import java.util.Scanner;

public class find_second_largest_element_in_array_part2
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
        int secondlargest = second_largest(num, n);
        System.out.println("Second largest number is" + secondlargest);

    }

    public static int second_largest(int[] arr, int n)
    {
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > largest)
            {
                secondlargest = largest;
                largest = arr[i];
                continue;
            }

            if (arr[i] > secondlargest)
            {
                secondlargest = arr[i];
            }

        }
        return secondlargest;
    }
}
