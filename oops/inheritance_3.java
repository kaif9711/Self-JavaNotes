public class inheritance_3
{
    int id;
    int salary;
    inheritance_3(int id, int salary)
    {
        this.id = id;
        this.salary = salary;
    }

        void displayEmployee(){
            System.out.println("Salary" + salary + "id" + id);
        }
    }

    class manager extends inheritance_3

    {
    int bonus;
    manager(int id, int salary, int bonus){
        super(id, salary);
        this.bonus = bonus;
        }

        void displayManager(){
        System.out.println("Salary : " + salary + "id : " + id + "Bonus : " + bonus);
        }
    }

class inh_manag{
    public static void main(String[] args){
        manager obj = new manager(2,120000, 25000);
        obj.displayManager();
    }
}
