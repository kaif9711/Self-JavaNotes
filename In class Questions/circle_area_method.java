// Question :  calculate area of cirlce by creating methods

import java.util.*;
public class circle_area_method{

    public static double c_area(double r)
    {

        double area;
        area = Math.PI * r * r;
        return area;
    }

    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius");
        double r = sc.nextDouble();

        System.out.println("Area of circle is :" + c_area(r));
    }
}
