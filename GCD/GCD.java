public class GCD {

    int findGcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
            {
                m=m-n;
            }
            else{
                n=n-m;
            }
        }

        return m;
    }

public static void main(String []args)
{
    GCD check=new GCD();
    System.out.println(check.findGcd(25,15));
}



}
