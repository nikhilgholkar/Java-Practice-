
import java.util.*;

public class array1 {



    public static void main(String args[])
    {
        int arr[]= {1,5,4,9,8,6,45,23};

        Scanner sc= new Scanner(System.in);
        int search = sc.nextInt();

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]==search)
            {
                System.out.println("The element is at index "+ i);
                System.exit(0);
            }

        }
        System.out.println("element not found");


    }
}
