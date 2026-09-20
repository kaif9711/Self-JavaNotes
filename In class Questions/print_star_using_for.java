public class print_star_using_for
{
    public static void main(String[] args){

        int count= 1;
        for(int i= 1; i<=8; i++){
            for( int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
