package Arrays;
//Given an array arr[], generate and return all possible subarrays. The subarrays must be returned in the following order:
//
//Subarrays starting from the first element, followed by those starting from the second element, and so on.
//For each starting index, subarrays should be arranged in increasing order of length.
//Input: arr[] = [1, 2, 3]
//Output: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
//Explanation: Starting with the first element, we generate subarrays [1], [1, 2], and [1, 2, 3]. Then, starting from the second element, we get [2] and [2, 3].  Finally, starting from the third element, we only get [3].
//
//Input: arr[] = [1, 2]
//Output: [[1], [1, 2], [2]]
//Explanation: Starting with the first element, we generate subarrays [1] and [1, 2]. Then, starting from the second element, we get [2].
//
//Input: arr[] = [1, 1]
//Output: [[1], [1, 1], [1]]
//Explanation: Starting with the first element, we generate subarrays [1] and [1, 1] (including both elements). Starting from the second element, we only get the subarray [1].
public class Generating_All_Subarrays
{
    public static void main(String[] args)
    {
     int[] arr = {1, 2, 3};
     printsubArray(arr);
    }

    static void printsubArray(int[] arr)
    {
        for( int start = 0; start< arr.length; start++)         //Outer loop selects the starting index.
        {
            for(int end = start ; end<arr.length; end++)        //inner loop select the ending index
            {
                System.out.print("[ ");
                for(int i = start; i<=end; i++)                 // run till the end index
                {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("]");
            }

        }
    }
}
