package Arrays;

//Input: arr[] = [10, 20, 30, 40, 50]
//Output: 10 30 50
//Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).
//
//Input: arr[] = [-5, 1, 4, 2, 12]
//Output: -5 4 12
public class Leaders_in_array
{
     static void leader_check(int[] arr)
    {


        for(int i = 0; i<arr.length; i++)   // this bigger for loop to check the elemts
        {
            boolean leader = true;
            for( int j = i+1; j<arr.length; j++)  // this smaller for loop is used to check the current element with the rest next element
            {
                if (arr[i] <= arr[j])               //check if current element is smaller or equal to next elemnt , if it is then
                {
                    leader = false;                 // false and break
                    break;
                }
            }
                if(leader)       //otherise if the current elkenment is bigger then the next elemenst then true , and this if is the part of big for loop
                {
                    System.out.println(arr[i] + " ");
                }

        }
    }

    public static void main(String[] args)
    {
        int[] num = {16, 17, 4, 3, 5, 2};

        leader_check(num);
    }
}

