package strings;

public class digitAfterDecimalString
{
    public static void main(String[] args){
    String txt = "12.758674";

    String result = digitAfterDecimal(txt);
    System.out.println(result);


    }
    static String digitAfterDecimal(String no){
        int pos = no.indexOf('.');
        if(pos<0)
        {
            return "";
        }
//        else{
//            return (no.substring(pos + 1));
//        }

        if(pos >= 0){
            return (no.substring(pos + 1));
        }
        return (no.substring(pos + 1));
    }


}
