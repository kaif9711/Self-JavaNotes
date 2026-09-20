//        1
//        01
//        101
//        0101
//        10101
//        010101
//        1010101

public class pattern_part4_forloop
{
    public static void main (String[] args){
        for(int i =1; i<=8; i++){
           for(int j =1; j<i; j++){       // j<i because if j<=i then j = i, every itirate and it will start from 0
               int x =  (i+j) % 2;        // (i+j)%2==0
               System.out.print(x);
           }
           System.out.println();
        }
    }
}
