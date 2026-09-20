import java.lang.reflect.ParameterizedType;

public class constructor_types
{
    int age;
    String name;


//    constructor_types()
//    {
//        System.out.print("No arg constructor\n");  //for no arg constructor , which is created manually with no parameter, use to call constructor
//    }

    constructor_types(int age)
    {
        this.age = age;                             // assigns value to intialize
        System.out.print("No arg constructor\n");  // use to call constructor
    }




//    public static void main(String[] args){
//    //1. default constructor
//
//        //here we create an object and compiler creates a constructor on its own that assigns 0 to int and null string.
////        constructor_types s1 = new constructor_types();
////        System.out.println(s1.age + " " + s1.name );
//
//    //2. No arg Constructor
////        constructor_types s1 = new constructor_types();
////        System.out.println(s1.age + " " + s1.name );
//
//    //3 Parametrized Constructor
//
//        constructor_types s1 = new constructor_types(23);  //initializes the ibject
//        System.out.println(s1.age + " " + s1.name );
//
//
//    }
}

//Parameterized Constructor  example

//class parametrized constr
//{
//        String name;
//        int emp_id;
//
//        parametrized(String name, int emp_id) {
//            this.name = name;
//            this.emp_id = emp_id;
//        }
//
//        public static void main(String[] args) {
//
//            parametrized e1 = new parametrized("deepak", 101);
//            parametrized e2 = new parametrized("abc", 102);
//
//            System.out.println("Employee 1 : " + e1.name + " " + e1.emp_id);
//            System.out.println("Employee 2 : " + e2.name + " " + e2.emp_id);
//        }
//}
