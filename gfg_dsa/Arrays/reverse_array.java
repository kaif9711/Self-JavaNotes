package Arrays;

public class reverse_array
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArr(arr);
        for(int x = 0; x<arr.length; x++)
        {
            System.out.print(arr[x] + " ");
        }
    }

    static void reverseArr(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;

        while(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }

    }
}
