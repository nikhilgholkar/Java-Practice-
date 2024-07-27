
import java.util.*;


public class insertarray {

  //0 1 2 3 4 _ _ _ _ _

    public static void main(String args[])
    {
        int arr[]=new int[10];
        for(int i=0;i<5;i++)
        {
            arr[i]=i;
        }
        Scanner sc= new Scanner(System.in);
        int index=sc.nextInt();
        int num=sc.nextInt();
        for(int i=5;i>index;i--)
        {

            arr[i]=arr[i-1];


        }
        arr[index]=num;
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
}
