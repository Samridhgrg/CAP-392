import java.util.*;
class co {
    Scanner sc = new Scanner(System.in);
    int sum;
    void rect()
    {
        System.out.println("the sum is");
    }
    void rect(int a,int b)
    {
        sum=a+b;
        System.out.println(sum);
    }
}
class cons
{
    public static void main(String Args[])
    {
        co obj=new co();
        obj.rect();
        obj.rect(2,6);
    }
}
