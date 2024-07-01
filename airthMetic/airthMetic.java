import java.sql.SQLOutput;
import java.util.*;
public class airthMetic {

    public static void main(String args[])
    {
        System.out.println("Enter the sides of the triangle");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double area;
        float s;
        s=a+b+c/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is "+ area);

    }
}
