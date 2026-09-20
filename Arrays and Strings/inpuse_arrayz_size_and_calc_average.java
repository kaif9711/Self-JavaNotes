import java.util.Scanner;

public class inpuse_arrayz_size_and_calc_average
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to define the size af an array");
        int n = sc.nextInt(); //taking size of an array

        int[] num = new int[n]; // creating an arr array object
        System.out.println("Enter the elemets of an array");

        for(int i= 0; i<num.length; i++){
            num[i] = sc.nextInt();

        }
        //array created

        //passing the argument on to the average() method to calculate the average of the array
        double mean = average(num);
        System.out.println("The average among the elements of the array is  " + mean );


    }
    public static double average(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        return (double)sum/arr.length;
    }

}
