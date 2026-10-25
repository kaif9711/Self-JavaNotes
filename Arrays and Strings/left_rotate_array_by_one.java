public class left_rotate_array_by_one
{
    public static void main(String[] args)
    {

        int[] num = {1, 2, 3, 4, 5};
        int n = num.length;

        left_rotate obj = new left_rotate();
        int[] k = obj.left_rotate_by_one(num, n);

        System.out.println(" The result for Left rotate array by one ");
        for(int k1 : k){
            System.out.print(k1 + " ");

        }

    }
}

class left_rotate{
    public int[] left_rotate_by_one(int[] arr, int n){
        int temp = arr[0];
        for(int i= 1; i<n; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

    return arr;
    }
}

