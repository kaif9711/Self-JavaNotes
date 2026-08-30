//Question
//
//Write a Java program using nested for loops and the break statement.
//
//The program should:
//
//Use an outer for loop that runs 2 times.
//Use an inner for loop that runs 2 times for each outer iteration.
//Print the value of j.
//When j becomes 1, use break to stop the inner loop.
//The outer loop should continue normally.
//        Expected Output
//        0
//        0

public class break_nested_loop
{
    public static void main(String[] args){
        for(int i=0; i<6; i++){
            for (int j=0; j<2; j++){
                if(j==1){
                    break;
                }
                System.out.printf("Outer loops = %d\n Inner loop= %d\n", i, j);;
            }
        }
    }
}
