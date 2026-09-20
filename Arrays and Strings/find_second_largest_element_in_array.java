import java.util.Scanner;

public class find_second_largest_element_in_array
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
            } else if (arr[i] > secondlargest && arr[i] != largest)
            {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

}
//static int secondLargest(int[] arr) {
//
//    // Assume the first element is the largest
//    int largest = arr[0];
//
//    // Start secondLargest with the smallest possible integer
//    int secondLargest = Integer.MIN_VALUE;
//
//    // Start from index 1 because index 0 is already used
//    for (int i = 1; i < arr.length; i++) {
//
//        // If current element is greater than largest
//        if (arr[i] > largest) {
//
//            // Old largest becomes the second largest
//            secondLargest = largest;
//
//            // Current element becomes the new largest
//            largest = arr[i];
//        }
//
//        // If current element is not the largest,
//        // check whether it can become the second largest
//        else if (arr[i] > secondLargest && arr[i] != largest) {
//
//            // Current element becomes the second largest
//            secondLargest = arr[i];
//        }
//    }
//
//    // Return the second largest element
//    return secondLargest;
//}
