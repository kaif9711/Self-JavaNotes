public class super_parent_constructor
{
    super_parent_constructor()          //constr of parent class
    {
        System.out.println(" Constructor of parent class");
    }
}

class xyz5 extends super_parent_constructor
{

    xyz5()                                // constr of child class
    {
        super();                          // called/refers to the immidiate parent/super class constr
        System.out.println(" Constructor of child class");
    }

    public static void main(String[] args){
        xyz5 obj = new xyz5();              // creates an object  of child(xyz5) class and call its constr
    }
}

