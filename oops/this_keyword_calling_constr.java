public class this_keyword_calling_constr
{
    this_keyword_calling_constr()
    {
        System.out.println("Default Employee Constructor");
    }

    this_keyword_calling_constr(String name)
    {
        this();
        System.out.println("Employee name : " + name);
    }
    public static void main (String[] args)
    {
        this_keyword_calling_constr obj = new this_keyword_calling_constr("Kaif");

    }
}
