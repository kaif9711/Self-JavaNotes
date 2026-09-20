public class initializing_objects_using_referencevariables
{
    String color;
    int age;

    public static void main(String[] args){
        initializing_objects_using_referencevariables cat = new initializing_objects_using_referencevariables();
        cat.age = 7;
        cat.color = "Black";

        System.out.println(cat.age + " " + cat.color);
    }
}
