//        *****
//        *****
//        *****
//        *****
//        *****

public class pattern
{
    public static void main(String[] args){
        int i = 1;
        while(i<6){      //First while selects/controls the row,
            int j= 1;    //this line initializes j to 1 and resets the value of j from 5 back to 1
            System.out.println();
            while(j<6){   //and second while fills each row.
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}
