


public class arrayRotation {


    public static void main(String [] args)
    {
        int []arr={3,6,9,12,45,68};
        int temp = arr[0];
        for( int i=0;i<arr.length;i++)
        {
           if(i==(arr.length-1))
           {
               arr[i]=temp;
           }
           else {
            arr[i] = arr[i + 1];
        }
           }

        for( int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }


}
