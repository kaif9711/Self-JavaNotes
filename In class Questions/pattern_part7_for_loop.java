public class pattern_part7_for_loop
{
    public static void main(String[] args){
        char ch = 'a';

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
