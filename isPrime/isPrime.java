 public class isPrime {

     boolean isPrimee(int num)
    {
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }

        }

        return true;
    }

    public static void main(String args[])
    {
        int num=91;

        isPrime check= new isPrime();
        System.out.println(check.isPrimee(num));

       // System.out.println(isPrimee(num));


    }


}
