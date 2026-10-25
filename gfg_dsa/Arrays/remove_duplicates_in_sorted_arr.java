package Arrays;

public class remove_duplicates_in_sorted_arr
{
    public static void main(String[] args)
    {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = remDuplicates(nums);
        for(int x = 0; x<k; x++)
        {
            System.out.print(nums[x] + " ");
        }
    }


    static int remDuplicates(int[] arr)
    {
        int i = 0;
        for(int j = 1; j<arr.length; j++)
        {
            if(arr[i] != arr[j])
            {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
