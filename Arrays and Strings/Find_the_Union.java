import java.util.HashSet;
import java.util.Set;

public class Find_the_Union
{


    public static void main(String[] args){
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        //  creatingobj oif Union class and calling its method
    Union obj1 = new Union();
    int[] result = obj1.union_to_set(arr1, arr2);

    //iterating the arr3 returnd from the union class method
    for(int i = 0; i<result.length; i++ ){
       System.out.println(result[i] + " ");
    }

    }

}

 class Union
{
    public int[] union_to_set(int[] arr1, int[] arr2)
    {
        //array -> set

        Set<Integer> number = new HashSet<>(); //create a hashset

        //adding elemnts of array1 into the set
        for(int i = 0; i<arr1.length; i++)
        {
            number.add(arr1[i]);
        }

        //adding elemnts of array2 into the set
        for(int j = 0; j<arr2.length; j++)
        {
            number.add(arr2[j]);
        }

        //creating new array3 specifying
        int[] arr3 = new int[number.size()];

        // set -> array3
        int i = 0;
        for(int num:number)
        {
            arr3[i] = num;
            i++;
        }

        return arr3;
    }


}

//T.C =
//S.C =
