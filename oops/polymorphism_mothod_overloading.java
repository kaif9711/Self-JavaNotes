//method overriding

public class polymorphism_mothod_overloading
{

    // 1 . method overriding with different number of arguments
//    int num(int a)
//    {
//        return a;
//    }
//
//    int num(int a, int b)
//    {
//        return a + b;
//    }



    // 2 . method overriding with different data type of arg
//    String num(String a)
//    {
//        return a;
//    }
//
//    int num(int a)
//    {
//        return a;
//    }



    // 3 . method overriding with different sequence and data typesof arg

    void num(String a, int b)
    {
        System.out.println(a + " "+  b);
    }

    void num(int a , String b )
    {
        System.out.println(a + " " +  b);
    }


    public static void main(String[] args){
        polymorphism_mothod_overloading obj1 = new polymorphism_mothod_overloading();
        obj1.num("kaif", 12);
        obj1.num(12, "kaif");


    }

}
