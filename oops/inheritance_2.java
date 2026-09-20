public class inheritance_2
{
    int id;
    int salary;

    inheritance_2(int i, int s){
        this.id = i;
        this.salary = s;
    }
}

class SaleEmp extends inheritance_2
{
    int salesBonus;

    SaleEmp(int i, int s, int sb)
    {
        super(i, s);
        this.salesBonus = sb;
    }
}
class test1{
    public static void main(String[] args)
    {
        SaleEmp obj = new SaleEmp(12, 120000, 12000);
        System.out.println("ID ; " + obj.id);
        System.out.println("SALARY ; " + obj.salary);
        System.out.println("SALES BONUS ; " + obj.salesBonus);

    }
}

