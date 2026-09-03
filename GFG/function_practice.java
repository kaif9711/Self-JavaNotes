import java.awt.*;

class Point{int a, b;}
public class function_practice
{
    public static void main(String[] args){
        Point p1 = new Point();
        p1.a = 10;
        p1.b = 20;

        System.out.println(p1.a + " " + p1.b);;
        method(p1);
        System.out.println(p1.a + " " + p1.b);;

    }
    public static void method(Point p1){
        p1.a=100;
        p1.b= 200;
    }
}
