class test
{
    int x;
    int y;

    test(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
     void fun(){
         System.out.println(" x is " + x + " y is " + y);
        }
}


class A extends test
{
    A(int x, int y){
      super(x, y);
    }
    public static void main(String[] args){
        test t = new test(1,2);
        A a = new A(3,4);
        System.out.println(t.x);
        System.out.println(t.y);
        System.out.println();
        System.out.println(a.x);
        System.out.println(a.y);
        t.fun();
        a.fun();



    }


}
