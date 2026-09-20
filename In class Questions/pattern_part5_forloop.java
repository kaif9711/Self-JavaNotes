//        1
//        121
//        12321
//        1234321



public class pattern_part5_forloop
{
    public static void main(String[] args){   //from top to bottom increasing
        for(int i = 1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
        for(int j=i-1; j>=1; j--){   // from bottom to top decreasing
            System.out.print(j);
        }
        System.out.println();
        }

    }
}
