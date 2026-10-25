public class this_keyword_part3
{
    int id;
    String name;

    this_keyword_part3(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    void display()
    {
        System.out.println("id : " + id + " name : " + name);
    }
    public static void main(String[] args)
    {
        this_keyword_part3 obj = new this_keyword_part3(02, "Mohammad Kaif");
        obj.display();
    }
}
