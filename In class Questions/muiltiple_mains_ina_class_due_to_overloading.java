public class muiltiple_mains_ina_class_due_to_overloading
{
    public static void main(String[] args){         //this main() is called automatically by JVM
        System.out.println("Hello");
        main(10);
    }

    public static void main(int a){                 //this has to be called inside the defaul main()
        System.out.println("hi");
    }

}
