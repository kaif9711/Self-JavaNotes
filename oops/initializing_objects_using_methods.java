public class initializing_objects_using_methods
{
    String color;
    int age;

    public static void main(String[] args){
        initializing_objects_using_methods cat = new initializing_objects_using_methods();
        cat.Objinit("Black", 7);
        cat.display();
    }

    void Objinit(String c, int a){
        color = c;
        age = a;
    }

    void display(){
        System.out.println("color is :" + color + " & " + "age is :" + age);
    }
}
