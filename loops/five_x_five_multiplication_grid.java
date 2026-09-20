package more_loops;

public class five_x_five_multiplication_grid
{
    public static void main(String[] args){
        int num = 1;
        int table =1;
        for (int i=1; i<=5; i++){
            for(int j =1; j<=5; j++){
                System.out.print(num * j);
            }
            System.out.println();
            num++;
        }

    }
}
