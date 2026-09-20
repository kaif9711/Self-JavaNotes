// Given an array of integers nums and an integer target,
// find the smallest index (0 based indexing) where the target appears in the array.
// If the target is not found in the array, return -1

public class linear_search
{
    public static void main(String[] args){
    int[] nums = {1,3,4,5,3, 3};
    int n = nums.length;
    int target  = 3;

    linear_search_array obj1 = new linear_search_array();
    int result = obj1.linearsearch(nums, target );
    System.out.println(result);
    }
}

class linear_search_array
{
    public int linearsearch(int[] arr, int target){

        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return  i;
            }
        }
        return -1;
    }
}
