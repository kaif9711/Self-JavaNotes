// Question: Calculate the are of circle ?
import java.util.*;

public class area_circumfrence_circlee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        double circumfrence = 2 * Math.PI * r;
        System.out.println("Are of circle is : " + area);
        System.out.println("Circumfrence of circle is : " + circumfrence);

    }
}
