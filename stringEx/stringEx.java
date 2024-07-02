public class stringEx {

    public static void main(String args[])
    {
        String str="hello";
        String str2= new String("hello");
        char c[]={'a','b','c'};
        String str3=new String(c);
        System.out.println(str==str2);
        System.out.println(str3);
    }
}
