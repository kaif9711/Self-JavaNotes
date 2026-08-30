import java.util.*;

public class skip_number_using_continue_part1
{
    public static void main(String[] args){
        for(int i = 0; i<=4; i++){
            if(i==1){
                continue;
            }
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

    }
}
