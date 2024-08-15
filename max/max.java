public class max {

    int max(int []arr)
    {
        int max=0;
        for(int x:arr)
        {
            if(x>max)
            {
                max=x;
            }
        }
        return max;
    }


    public static void main(String []args)
    {
        max check = new max();
        int arr[]={20,99,102,10};
        System.out.println(check.max(arr));
    }


}
