package Arrays;

public class left_rotate_array_by_1
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        left_rot(arr);
        for(int x = 0; x<arr.length; x++)
        {
            System.out.print(arr[x] + " ");
        }
    }

    static void left_rot(int[] arr)
    {
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            arr[i-1] = arr[i];

        }
        arr[arr.length -1] = temp;

    }
}
