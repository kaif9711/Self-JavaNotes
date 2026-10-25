package Arrays;

public class move_zeros_to_end_in_array
{
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};
        move_zeroes(arr);
        for(int x = 0; x<arr.length; x++)
        {
            System.out.print(arr[x] + " ");
        }
    }

    static void move_zeroes(int[] arr)
    {
        int pos = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == 0 )
            {
                continue;
            }

            arr[pos] = arr[i];
            pos++;
        }
            for(int j = pos; j<arr.length; j++)
            {
                arr[j] = 0;
            }
    }
}
