import java.util.*;
class bank 
{
    Scanner sc=new Scanner(System.in);
    double n,bal,with,dep,x,i;
    void get()
    {
        System.out.println("enter the balance");
        bal=sc.nextInt();
    }
    void cal()
    {
    System.out.println("enter 1 to check the balance");
    System.out.println("enter 2 to deposit");
    System.out.println("enter 3 to withdrawl");
    System.out.println("enter 4 to exit");
    n=sc.nextInt();    
    if(n==1)
    {
        System.out.println("the balance is"+bal);
    }
    else if(n==2)
    {
        System.out.println("enter the amount to be deposited");
        dep=sc.nextInt();
        bal=bal+dep;
        System.out.println("the amount is"+bal);
        dep=0;
    }
    else if(n==3)
    {
        System.out.println("enter the amount to be withdrawn");
        with=sc.nextInt();
        if(bal<1000)
        {
           System.out.println("insufficient balance");
        }
        else
        {
            bal=bal-with;
            with=0;
        }
    }
    else
    {
        System.out.println("exit");
    }
    }
}
class ca1
{
    public static void main(String args[])
    {
        bank obj=new bank();
        obj.get();
        obj.cal();
    }
}
