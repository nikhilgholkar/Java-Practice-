public class validgmail {

    public static void main(String args[])
    {
        String mail="programme-r@gmail.com";
        if(mail.matches("[a-z]*@gmail.*"))
        {
            System.out.println("the given mail of user "+ mail.substring(0,10)+ "is valid as domain");
        }

    }
}
