import java.util.*;
public class takeInput {

    public static void main(String args[])
    {
        System.out.println("Please enter your age");
        Scanner inp = new Scanner(System.in);
        int age = inp.nextInt();
        System.out.println("Your age is "+age);
    }
}
