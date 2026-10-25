public class getter_setter
{
    private int age;  //data hiding private variable

    public void setAge(int age) //setter method, setting the age using this keyword return type wil be void as nothing returning
    {
        this.age = age;
    }

    public int getAge()  //getter method,  get/read/return the age, return type will be of the variable, here is int.
    {
        return age;
    }
}

class xyz7
{
    public static void main(String[] args)
    {
        getter_setter obj = new getter_setter();
        obj.setAge(25);             // this sets the age
        System.out.println(obj.getAge());       // read/return/get the age
    }

}

