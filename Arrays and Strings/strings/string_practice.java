//package strings;
//
//public class string_practice
//{
//    public static void main(String[] args)
//{
//    String str = new String();
//    String st2r = "hello wolrds";
//    str = "abchsdwwwd";
//    System.out.println(str.length());
//    System.out.println(str.charAt(1));
//
//}
//}

public class string_practice{
//    public static void main(String[] args){
//        //
//        char[] arr = {'k', 'a', 'i', 'f'};
//        // string objects are immutable
//        String str = new String("kAIF");
//
//        //multi-threaded prgram that requires mutable
//        StringBuffer str1 = new StringBuffer("md");
//        str1.append("Kaif");
//
//        //single threaded prgram that requires mutable
//        StringBuilder str2 = new StringBuilder("ducat");
//        str2.append("noida");

//        public static void main(String[] args){
//            String str = "kaif";
//            String str1 = new String("Mohammad kaif");
//
//            System.out.println(str1.length());
//            System.out.println(str1.charAt(3));
//            System.out.println(str1.substring(2));  // retunrs // int value
//            System.out.println(str1.substring(1, 8));  //returns int alue
//            System.out.println(str1.contains(str)); //returns boolean
//            System.out.println(str1.equals(str));  // returns boolean
//            System.out.println(str1.indexOf(str));  // gives starting index of str in str1 return int value
//
//
//        }
//    public static void main(String[] args){
//        String s1 = "Kaif";
//        String s2 = "Zaid";
////        If S1 comes before S2 → result is less than 0
////        If S1 and S2 are same → result is 0
////        If S1 comes after S2 → result is greater than 0
////
//        int result = s1.compareTo(s2);  //compare return int value
//        if(result ==0){
//            System.out.println ("Same");
//        }
//        if (result>0){
//            System.out.println ("S1 is greater");
//        }
//        if(result<0){
//            System.out.println ("S1 is smaller");
//        }
//    }

//    public static void main(String[] args){
//        //two string objects referening to same value.
//        String str = "kaif";
//        String str1 = str;
//
//        str = str + "geeksforgeeks";
//        //str = str.concat(geeksforgeeks);  // here new object of the tring class is created with value kaifgeeksforgeeks
//
//        System.out.println(str);
//        System.out.println(str==str1);
//
//}
//    public static void main(String[] args){
//    String str = "Kaif";
//    String str2 = "KAIF";
//    System.out.println(str.equalsIgnoreCase(str2));   //return booleon
//
//
//    }

//    public static void main(String[] ags){
//        String str = "Kaif";
//        String str2 = "KAIF";
//        System.out.println(str.toUpperCase());
//        System.out.println(str2.toLowerCase());
//    }
//    public static void main(String[] args){
//    String str = "Kaif";
//
//    System.out.println(str.substring(1, 3));
//        System.out.println(str.substring(1));
//
//
//
//    }
//// strinbuilder and stringbuffer both are mutable
//    public static void main(String[] args){
//        StringBuilder s1 = new StringBuilder("kaif");
//        StringBuilder s2 = s1;
//        s1 = s1.append("Mohammadkaif");
//        if(s1==s2)
//        {
//            System.out.println("same");
//        }
//            else
//            {
//            System.out.println("not same");
//            }
//        }

    public static void main(String[] args){
        StringBuilder s1= new StringBuilder("abcd");
        s1.reverse();
        System.out.println(s1);

        s1.append("efgh");
        System.out.println(s1);
        s1.setCharAt(1, 'z');
        System.out.println(s1);
        s1.delete(0,4);
        System.out.println(s1);
        s1.insert(0, "candy");
        System.out.println(s1);



    }




}
