public class constructor
{
    String name;
    int age;

    constructor(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        constructor s1 = new constructor("max", 25);
        constructor s2 = new constructor("candy", 7);

        System.out.println(s1.name);
        System.out.println(s2.age);




    }
}
