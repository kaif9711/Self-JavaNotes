public class remove_duplicates_from_sorted_array
{
    public static void main(String[] args)
    {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = nums.length;

//        int duplicates = removeduplicates(nums, n);
//        System.out.println("unique elemnts are : ");
//        for (int x = 0; x < duplicates; x++)
//        {
//            System.out.print(x + " ");
//        }
        duplicates obj = new duplicates();
        // obj.removeduplicates(nums,n);
        int k = obj.removeduplicates(nums,n);
        for (int x = 0; x < k; x++)
              {
                  System.out.print(nums[x] + " ");
              }
    }
}

class duplicates
{
    // {0,0,1,1,1,2,2,3,3,4};
      public int removeduplicates(int[] num, int n)
    {
        int i = 0;
        for (int j = 1; j < n; j++)
        {
            if (num[i] != num[j])
            {
                num[i + 1] = num[j];
                i++;

            }
        }
        return i + 1;
    }
}
