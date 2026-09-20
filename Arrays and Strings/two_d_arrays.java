public class two_d_arrays
{
    public static void main(String[] args)
    {
//        int arr[][] = {{1,3,55,77,223,}, {4, 5, 6}};
//
//        for(int i = 0; i<arr.length; i++){                              // arr.length represents the lenght of the oput array
//            for(int j=0; j<arr[i].length; j++){                               //j<arr[i].length represernt lenghtr of the each inner array
//                System.out.printf ("arr[%d][%d] : %d\t",i,j, arr[i][j]);
//            }
//            System.out.println();
//        }

        int m =2, n = 3;
        int[][] arr = new int[m][n];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j]=10;
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }


    }
}


