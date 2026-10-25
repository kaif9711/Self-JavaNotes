public class inheritance_hasA
{
    String departmentName;
    inheritance_hasA(String departmentName)
    {
        this.departmentName = departmentName;
    }

}

class Employee
{
    int id;
    String name;
    inheritance_hasA department;  // will take a reference var of heritance_hasA in this employee class

    Employee(int id, String name, inheritance_hasA department)
    {
        // Constructor to initialize employee details // It also accepts an object of inheritance_hasA as a parameter
        this.id = id;
        this.name = name;
        this.department = department;

    }
    void display()
    {
        System.out.println("id ; " + id);
        System.out.println("name ; " + name);
        System.out.println("department ; " + department.departmentName); // Access departmentName using the department reference
    }
}

class mainCall
{
    public static void main(String[] args)
    {
        // Pass the department object reference to the Employee constructor // This establishes the HAS-A relationship (aggregation)
        inheritance_hasA obj = new inheritance_hasA("IT");
        Employee obj1 = new Employee(101, "Kaif", obj);

        obj1.display();
    }

}
