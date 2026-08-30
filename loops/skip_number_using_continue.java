public class skip_number_using_continue
{
    public static void main(String[] args){
        int n;
        for (n=0; n<=4; n++){
            if(n==3){
                continue;
            }
            System.out.println(n);
        }
    }
}
