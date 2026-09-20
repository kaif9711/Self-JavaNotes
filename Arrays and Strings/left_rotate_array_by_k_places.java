public class left_rotate_array_by_k_places
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int n = nums.length;
        int k = 2;


        int [] result = left_rotate_by_k(nums, n);
        for ( int x = 0; x<result.length; x++){
        System.out.println(result[x] + " ");
            }
    }

    public static int[] left_rotate_by_k(int []arr, int n){
        int k =2;
        int[] temp = {1, 2};                //array to store forst two elements as k = 2;
        for(int i = k; i<n; i++){           //loop to shift elements from i =2  to n-1 two digits left
            arr[i-k] = arr[i];              // eg;  arr[2-2= 0] = [2]
        }

        //now replace temp[]  at the end
        // { 3,4,5,6,7,temp{1,2}}
        for(int j = n-k; j < n ; j++){     // now starting from the index where we want to put the temp[]
            arr[j]= temp[j -(n-k)];        // arr[5] = temp[5-(7-5) = 0]
        }

        return arr;
    }
}
