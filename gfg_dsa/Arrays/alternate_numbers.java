package Arrays;

public class alternate_numbers
{
    // 1,2,3,4,5,66,7,8
    static int[] alternate(int[] arr)
        {
            for( int i = 0; i<arr.length; i += 2)
            {
                System.out.println(arr[i]);
            }
            return arr;
        }
    public static void main(String[] args )
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] alternate_arr = alternate(arr);
    }
}
