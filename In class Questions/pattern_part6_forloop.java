//        a
//        ab
//        abc
//        abcd
//        abcde
//        abcdef
//        abcdefg
//        abcdefgh

public class pattern_part6_forloop
{
    public static void main(String[] args){
        for (int i = 1; i <= 8; i++){
            for(char j= 'a'; j< 'a' + i; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
