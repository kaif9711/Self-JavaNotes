package more_loops;

public class multiplication_grid_using_nested_while
{
    public static void main(String[] args){
        int num =1;
        int i = 1;
        while(i<=4){
            int j =1;
            while(j<=4){
                System.out.print(num*j);
                j++;
            }
            System.out.println();
            num++;
            i++;
        }


    }
}
