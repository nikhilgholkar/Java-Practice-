
import java.util.*;

public class conditionalStates {

    public static void main(String args[])
    {
        System.out.println("enter your age");
        Scanner inp = new Scanner(System.in);
        int age=inp.nextInt();
        if(age<18){
            System.out.println("you are under age");
        }
        else if(age>=18 && age<59){
            System.out.println("You have perfect age");
    }
        else{
            System.out.println("You are old");
        }
    }
}
