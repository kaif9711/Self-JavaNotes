import java.util.Scanner;

public class maximum_in_an_array
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemets of an array");
        int[] num = new int[5];

        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        int result = findmaxvalue(num);
        System.out.println("Maximum elemets of the arra is " + result);

    }
    public static int findmaxvalue(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
}
