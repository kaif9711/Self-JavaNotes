public class continue_while_example
{
    public static void main(String[] args){
        int i=0;
        while(i<3){
            i++;
            System.out.printf("i before is %d\n", i);
            if(i==2){
                continue;
            }
            System.out.printf("i after is %d\n", i);
        }

    }
}
