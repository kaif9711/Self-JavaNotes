public class inclass
{
    void showAge()
    {
        System.out.println("my age is 67");
    }

}

class inclass1 extends inclass
{
    void showAge1(int a)
    {
        System.out.println("my age is 35");

    }

}

class inclass2 extends inclass1
{

    void showAge2()
    {
        System.out.println("my age is 19");
    }

    public static void main(String[] args)
    {
        inclass2 obj = new inclass2();
        obj.showAge();
        obj.showAge1(22);
        obj.showAge2();

    }


}




