public class exp {
    public static void main(String args[])
    {
        try
    {
        int a=5,b=0,c;
        c=a/b;
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    System.out.println("null");
}
}
