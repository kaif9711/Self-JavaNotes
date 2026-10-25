public class super_part1
{
    int i =10;

}
class xyz2 extends super_part1
{
    int i = 20;
    void show(int i)
    {
        System.out.println(i); // this refers to the paramter i
        System.out.println(this.i); // this refers to the instance variable of xyz2 class (refers to current class object)
        System.out.println(super.i); // refers to super/parent class object

    }

    public static void main(String[] args)
    {
        xyz2 obj = new xyz2();
        obj.show(30);
        System.out.println(obj.i);



    }
}
