


public class array2 {


    public static void main(String args[])
    {
        int arr[]={2,45,78,1,6,9,87,369,404};
        int maxNo=0;
        int max2=0;
        for(int x:arr)
        {
            if(x>maxNo)
            {
                max2=maxNo;
                maxNo=x;
            }
            else if (x>max2)
        {
            max2=x;
        }
        }
        System.out.println("The maximum number is "+ maxNo+"\n"+"second largest no. is "+max2);



    }
}
