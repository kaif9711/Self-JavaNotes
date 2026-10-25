public class class1
{
    // instance variables
    int eid;
    String ename, address;

    void set_data(int eid, String en, String addr) //internal parameters of this method to initialize the instance variables
    {
            this. eid = eid;
            this.address = addr;
            this.ename = en;
    }
    void get_data()
    {
        //return eid + address + ename;
    }

    Object[] get_data1()
    {
        return new Object[]{eid, address, ename}; // creates and object array
    }

    void set_data1()
    {
        System.out.println("Employe info" + eid + address + ename);
    }
    public static void main(String[] args)
    {
        class1 obj = new class1();
        obj.set_data(1, "Noida", "Kaif" );
        obj.set_data1();
        obj.get_data();
        Object[] info = obj.get_data1(); // store the object array in object[] infor
        System.out.println(info[0]);    // calling elements of the object array[]
    }
}
