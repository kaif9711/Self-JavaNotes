// Question: Calculate the are of circle ?
import java.util.*;

public class circle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;

        System.out.println("Are of circle is : " + area);
    }
}
