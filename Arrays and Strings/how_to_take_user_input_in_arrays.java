import java.util.Scanner;

public class how_to_take_user_input_in_arrays
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];                                                         //initial;ise an array
        System.out.print("Enter the length of the array ");
        int n = sc.nextInt();                                               //take the lenght for the array


        // Manually adding elements

//        System.out.print("Enter 0th element ");
//        arr[0] = sc.nextInt();
//        System.out.print("Enter 1th element ");
//        arr[1] = sc.nextInt();
//        System.out.print("Enter 2nd element ");
//        arr[2] = sc.nextInt();
//        System.out.print("Enter 4rd element ");
//        arr[3] = sc.nextInt();
//        System.out.print("Enter 5th element ");
//        arr[4] = sc.nextInt();


        System.out.print("Enter the elements  ");
        for(int i = 0; i<arr.length; i++){                       // for loop iterating i over indexes and asking user to enter element at each index
            arr[i] = sc.nextInt();
        }


        for(int num : arr){                               //one way to get elements of the array
            System.out.println(num + " ");
        }

//        for(int i = 0; i<arr.length; i++){               //other wats to get the elements + indexes of the array
//            System.out.println(arr[i] + " ");
//            //
//        }

    }
}
