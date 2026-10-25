public abstract class abstraction
{
    int x;
    abstract void show(int n, String name);
}

class cat1 extends abstraction
{
    //int x =9;
    void show(int n,String name ){
        System.out.println("Dog");
        super.x = 50;
        System.out.println(super.x);
    }
}

class cat2 extends abstraction
{
    //int x =10;
    void show(int k,String name){
        System.out.println("Cat");
        super.x = 40;
        System.out.println(super.x);
    }
    public static void main(String[] args)
    {
        cat1 obj1 = new cat1();
        obj1.show(2, "Max");
        System.out.println(obj1.x=22);

        cat2 obj2 = new cat2();
        obj2.show(3, "Candy");
        System.out.println(obj2.x=33);
        obj1.x=9;
    }

}
