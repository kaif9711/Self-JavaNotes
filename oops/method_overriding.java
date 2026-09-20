public class
method_overriding
{
    void show(String a , int b){                                //1. method with no arg  //2. method with same type arg //3.method with same seq of arg
        System.out.println("1");
    }

}

class xyz extends method_overriding
{
    void show(String a, int b){                                //1. method with no arg    //2. method with same type arg //3.method with same seq of arg
        System.out.println("2");
    }

    public static void main(String[] args)
    {

        method_overriding obj1 = new method_overriding();
        obj1.show("ka", 12);
        obj1.show("ka", 8);

        method_overriding obj3 = new xyz();
        obj3.show("um" , 12);

        xyz obj2 = new xyz();
        obj2.show("za", 66);

    }
}
