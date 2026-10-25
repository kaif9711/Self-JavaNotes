public class static_method
{
    int  eid;
    String ename;
    static String cname = "tcs";

    void input(int eid, String ename)   // here we can change the static var, but not a good practice becuase we want it to remain same for every obj
                                        // we created a static method for it to change it seperating by calling it with the class
    {
        this.eid = eid;
        this.ename = ename;
    }

    static void cchange(String cn)  // here we created static method and put the static var inside
                                    // once changed it will remain that only.
    {
         cname = cn;
    }

    void display()//int eid, String ename, String cname)
    {
        System.out.println(eid + " , " + ename +  " , " + cname);
    }
    public static void main(String[] args)
    {
           static_method obj1 = new static_method();
           obj1.input(2001, "kaif");
           obj1.display();
           static_method.cchange("Google");    // it will remain google now , as we are changing the class static variable
            obj1.display();


        static_method obj2 = new static_method();
        obj2.input(2002, "mohammad");
        obj2.display();

    }
}
