
import java.lang.*;
class identifySpace {


    public static void main(String args[])
    {
        String s= "Nikhil is very handsome";
        ///identify number of space in the string
        int count=0;
        for(int i = 0; i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c == ' ')
            {
                count++;
            }


        }
        System.out.println(count);
    }
}