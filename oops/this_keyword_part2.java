public class this_keyword_part2
{
    int marks =50;

    void showMarks(int marks)
    {
        System.out.println(marks + " local variable ");
        System.out.println(this.marks + " instance parameter");
    }

    public static void main(String[] args)
    {
        this_keyword_part2 obj = new this_keyword_part2();
        obj.showMarks(99);
    }
}
